package apps.gali.com.hugsapp.view;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import apps.gali.com.hugsapp.R;
import apps.gali.com.hugsapp.controller.FragmentChanger;
import apps.gali.com.hugsapp.controller.MySQLHelper;
import apps.gali.com.hugsapp.model.DBConstants;
import apps.gali.com.hugsapp.model.Meeting;
import apps.gali.com.hugsapp.model.Participant;
import apps.gali.com.hugsapp.model.Subject;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    FragmentChanger fragmentChanger;
    protected View mRootView;
    MySQLHelper mySQLHelper;
    RecyclerView cardsRV;
    ArrayList<Participant> allParticipants = new ArrayList<>();

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragmentChanger = (FragmentChanger) getActivity();
        if(mRootView==null){
            mRootView = inflater.inflate(R.layout.fragment_main, container, false);
        }

        //get all participants
        allParticipants = fillAllParticipantsData();

        cardsRV = (RecyclerView)mRootView.findViewById(R.id.cardsRV);
        cardsRV.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL,false));
        cardsRV.setAdapter(new CardsListAdapter());

        return mRootView;
    }

    private ArrayList<Participant> fillAllParticipantsData() {
        ArrayList<Participant> participants = new ArrayList();
        Cursor cursor = mySQLHelper.getReadableDatabase().query(DBConstants.TABLE_NAME_PARTICIPANTS, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            int id = cursor.getInt(cursor.getColumnIndex(DBConstants.COLUMN_NAME_ID));
            String name = cursor.getString(cursor.getColumnIndex(DBConstants.COLUMN_NAME_PARTICIPANTS_NAME));
            String extra = cursor.getString(cursor.getColumnIndex(DBConstants.COLUMN_NAME_PARTICIPANTS_EXTRA));
            Participant participant = new Participant(id, name, extra);

            Cursor innerCursor = mySQLHelper.getReadableDatabase().query(DBConstants.TABLE_NAME_SUBJECTS, null, DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID+"=?", new String[]{""+id}, null, null, null);
            while (innerCursor.moveToNext()) {
                int subjectId = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_ID));
                String subjectName = innerCursor.getString(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_SUBJECTS_NAME));
                Subject subject = new Subject(subjectId, subjectName);
                subject.setParticipant(participant);
                participant.addSubject(subject);
            }

            if (participant.getSubjects().size()>0)
                participants.add(participant);
        }

        return participants;
    }

    class CardsListAdapter extends RecyclerView.Adapter<CardsListAdapter.CardViewHolder> {

        public int getAdapterPosition() {
            return getAdapterPosition();
        }

        public CardsListAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View singleview = LayoutInflater.from(getActivity()).inflate(R.layout.single_participant_card, parent, false);
            CardViewHolder singleResultVH = new CardViewHolder(singleview);
            return singleResultVH;
        }

        @Override
        public int getItemCount() {
            return allParticipants.size();
        }

        public void onBindViewHolder(CardsListAdapter.CardViewHolder holder, int position) {
            Participant participant = allParticipants.get(position);
            holder.bindData(participant);
        }

        class CardViewHolder extends RecyclerView.ViewHolder {

            TextView nameTV;
            MyListView subjectsLV;

            public CardViewHolder(View itemView) {
                super(itemView);
                nameTV = (TextView) itemView.findViewById(R.id.nameTV);
                subjectsLV = (MyListView) itemView.findViewById(R.id.subjectsLV);
            }

            public void bindData (Participant participant) {
                nameTV.setText(participant.getName());
                final ArrayList<Subject> subjects = participant.getSubjects();
                subjectsLV.setAdapter(new ArrayAdapter<Subject>(getActivity(),android.R.layout.simple_list_item_1, subjects));
                subjectsLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        //Toast.makeText(getActivity(), ""+subjects.get(position).getId(), Toast.LENGTH_SHORT).show();
                        fragmentChanger.changeFragmentToSubject(subjects.get(position));
                    }
                });
            }


        }



    }




}
