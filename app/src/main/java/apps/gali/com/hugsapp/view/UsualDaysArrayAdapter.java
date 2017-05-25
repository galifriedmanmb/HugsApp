package apps.gali.com.hugsapp.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import apps.gali.com.hugsapp.R;
import apps.gali.com.hugsapp.controller.Utils;
import apps.gali.com.hugsapp.model.Meeting;
import apps.gali.com.hugsapp.model.UsualDay;

/**
 * Created by 1 on 5/23/2017.
 */

public class UsualDaysArrayAdapter extends ArrayAdapter {

    Context context;
    int singleObjectLayout;
    ArrayList<UsualDay> list;

    public UsualDaysArrayAdapter(Context context, int resource, ArrayList<UsualDay> objects) {
        super(context, resource, objects);
        this.context = context;
        this.singleObjectLayout = resource;
        this.list = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        UsualDay item = list.get(position);
        View v = LayoutInflater.from(context).inflate(singleObjectLayout, null);
        TextView dayOfWeekTV = (TextView) v.findViewById(R.id.dayOfWeekTV);
        TextView timeOfDayTV = (TextView) v.findViewById(R.id.timeOfDayTV);

        dayOfWeekTV.setText(Utils.getDisplayDayOfWeek(context, item.getDayOfWeek()));
        timeOfDayTV.setText(item.getTimeOfDay());

        return v;
    }
}
