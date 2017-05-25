package apps.gali.com.hugsapp.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import apps.gali.com.hugsapp.R;
import apps.gali.com.hugsapp.controller.Utils;
import apps.gali.com.hugsapp.model.Meeting;

public class AllMeetingTabFragment extends Fragment {

    ArrayList<Meeting> meetingsList;

    public AllMeetingTabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all_meeting_tab, container, false);
        ListView listView = (ListView)view.findViewById(R.id.listView);

        listView.setAdapter(new MeetingsArrayAdapter(getActivity(),R.layout.single_meeting,meetingsList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Meeting meeting = meetingsList.get(position);
                Toast.makeText(getActivity(), Utils.getDisplayDateFromDate(meeting.getScheduledDate()), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    class MeetingsArrayAdapter extends ArrayAdapter {

        Context context;
        int singleObjectLayout;
        ArrayList<Meeting> list;

        public MeetingsArrayAdapter(Context context, int resource, ArrayList<Meeting> objects) {
            super(context, resource, objects);
            this.context = context;
            this.singleObjectLayout = resource;
            this.list = objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            Meeting item = list.get(position);
            View v = LayoutInflater.from(context).inflate(singleObjectLayout, null);
            TextView scheduledDateTV = (TextView) v.findViewById(R.id.scheduledDateTV);
            TextView extraTV = (TextView) v.findViewById(R.id.extraTV);
            TextView cancelExtraTV = (TextView) v.findViewById(R.id.cancelExtraTV);
            ImageView showupIV = (ImageView) v.findViewById(R.id.showupIV);

            scheduledDateTV.setText(Utils.getDisplayDateFromDate(item.getScheduledDate()));
            extraTV.setText(item.getExtra());
            cancelExtraTV.setText(item.getCancelExtra());

            //set showup
            if (item.getShowUp() == 1) {
                showupIV.setImageResource(R.drawable.hand_hollow_green);
            } else if (item.getShowUp() == 0) {
                showupIV.setImageResource(R.drawable.hand_hollow_red);
            } else {
                //showupIV.setVisibility(View.INVISIBLE);
            }

            //set text color.  cancelled: grey, payed: greeen, not payed: red
            if (item.isCancelled()) {
                scheduledDateTV.setTextColor(ContextCompat.getColor(context, R.color.meetingCancelled));
            } else {
                if (item.getPayment() == null)
                    scheduledDateTV.setTextColor(ContextCompat.getColor(context, R.color.meetingNotPayed));
                else {
                    scheduledDateTV.setTextColor(ContextCompat.getColor(context, R.color.meetingPayed));
                }
            }

            return v;
        }
    }
}
