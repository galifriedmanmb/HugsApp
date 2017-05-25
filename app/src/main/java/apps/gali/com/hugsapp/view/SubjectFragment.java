package apps.gali.com.hugsapp.view;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import apps.gali.com.hugsapp.R;
import apps.gali.com.hugsapp.controller.MySQLHelper;
import apps.gali.com.hugsapp.controller.Utils;
import apps.gali.com.hugsapp.model.DBConstants;
import apps.gali.com.hugsapp.model.Meeting;
import apps.gali.com.hugsapp.model.Payment;
import apps.gali.com.hugsapp.model.Subject;
import apps.gali.com.hugsapp.model.UsualDay;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubjectFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    MySQLHelper mySQLHelper;
    Subject subject;
    //Context context;

    private FragmentTabHost mTabHost;

    public SubjectFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //this.context = getActivity();
        View view = inflater.inflate(R.layout.fragment_subject, container, false);

        fillSubject();

        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getFragmentManager()));

        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) view.findViewById(R.id.tabs);
        tabsStrip.setViewPager(viewPager);

        ((TextView)view.findViewById(R.id.subjectNameTV)).setText(subject.getName());
        ((TextView)view.findViewById(R.id.participantTV)).setText(subject.getParticipant().getName());
        ((TextView)view.findViewById(R.id.locationTV)).setText(subject.getLocation());
        ((TextView)view.findViewById(R.id.costTV)).setText(""+subject.getCost()+" "+subject.getCostType());

        ListView usualDaysLV = (ListView) view.findViewById(R.id.usualDayLV);
        usualDaysLV.setAdapter(new UsualDaysArrayAdapter(getActivity(),R.layout.single_usual_day, subject.getUsualDays()));

        return view;
    }

    private void fillSubject() {
        Cursor cursor = mySQLHelper.getReadableDatabase().query(DBConstants.TABLE_NAME_SUBJECTS, null, DBConstants.COLUMN_NAME_ID+"=?", new String[]{""+subject.getId()}, null, null, null);
        while (cursor.moveToNext()) {
            subject.setLocation(cursor.getString(cursor.getColumnIndex(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION)));
            subject.setCost(cursor.getDouble(cursor.getColumnIndex(DBConstants.COLUMN_NAME_SUBJECTS_COST)));
            subject.setCostType(cursor.getString(cursor.getColumnIndex(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE)));
            subject.setExtra(cursor.getString(cursor.getColumnIndex(DBConstants.COLUMN_NAME_SUBJECTS_EXTRA)));

            ArrayList<UsualDay> usualDays = new ArrayList<>();
            Cursor innerCursor = mySQLHelper.getReadableDatabase().query(DBConstants.TABLE_NAME_USUAL_DAYS, null, DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID+"=?", new String[]{""+subject.getId()}, null, null, null);
            while (innerCursor.moveToNext()) {
                int dayOfWeek = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK));
                String timeOfDay = innerCursor.getString(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY));
                usualDays.add(new UsualDay(dayOfWeek,timeOfDay));
            }
            subject.setUsualDays(usualDays);

            ArrayList<Meeting> meetings = new ArrayList<>();
            innerCursor = mySQLHelper.getReadableDatabase().query(DBConstants.TABLE_NAME_MEETINGS, null, DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID+"=?", new String[]{""+subject.getId()}, null, null, DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE);
            while (innerCursor.moveToNext()) {
                int id = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_ID));
                int paymentId = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID));
                String scheduledDate = innerCursor.getString(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE));
                String location = innerCursor.getString(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_LOCATION));
                int showUp = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP));
                int cancelled = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED));
                String cancelExtra = innerCursor.getString(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_CANCEL_EXTRA));
                int replacedBy = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY));
                int forPayment = innerCursor.getInt(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT));
                String extra = innerCursor.getString(innerCursor.getColumnIndex(DBConstants.COLUMN_NAME_MEETINGS_EXTRA));

                Payment payment = null;
                if (paymentId!=-1)
                    payment = new Payment(paymentId);

                meetings.add(new Meeting(id,subject,payment, Utils.getDateFromDBStr(scheduledDate),location,showUp,Utils.getBoolean(cancelled),cancelExtra,replacedBy,Utils.getBoolean(forPayment),extra));
            }
            subject.setMeetings(meetings);
        }
    }

    private class SampleFragmentPagerAdapter extends FragmentStatePagerAdapter {
        final int PAGE_COUNT = 3;

        private String tabTitles[];

        public SampleFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
            String tabAll = getResources().getString(R.string.tab_all);
            String tabFuture = getResources().getString(R.string.tab_future);
            String tabOwe = getResources().getString(R.string.tab_owe);
            tabTitles = new String[] { tabAll, tabFuture, tabOwe };
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int position) {
            //Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();

            AllMeetingTabFragment allMeetingTabFragment = new AllMeetingTabFragment();
            switch (position) {
                case 0:
                    allMeetingTabFragment.meetingsList = subject.getMeetings();
                    return allMeetingTabFragment;
                case 1:
                    ArrayList<Meeting> futureMeetings = new ArrayList<>();
                    for (int i = 0; i < subject.getMeetings().size(); i++) {
                        Meeting meeting = subject.getMeetings().get(i);
                        if (meeting.getScheduledDate().after(new Date()))
                            futureMeetings.add(meeting);
                    }
                    allMeetingTabFragment.meetingsList = futureMeetings;
                    return allMeetingTabFragment;
                case 2:
                    ArrayList<Meeting> oweMeetings = new ArrayList<>();
                    for (int i = 0; i < subject.getMeetings().size(); i++) {
                        Meeting meeting = subject.getMeetings().get(i);
                        if (meeting.getPayment()==null)
                            oweMeetings.add(meeting);
                    }
                    allMeetingTabFragment.meetingsList = oweMeetings;
                    return allMeetingTabFragment;
                default:
                    return null;
            }
            //return PageFragment.newInstance(position + 1);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            return tabTitles[position];
        }


    }

}
