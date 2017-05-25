package apps.gali.com.hugsapp.controller;

import android.content.ContentValues;
import android.content.Context;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import apps.gali.com.hugsapp.R;
import apps.gali.com.hugsapp.model.DBConstants;

/**
 * Created by 1 on 5/18/2017.
 */

public class Utils {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static void FillStarterDB(MySQLHelper mySQLHelper) {
        ContentValues contentValues;

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_PARTICIPANTS_NAME,"יוחנן");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_PARTICIPANTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_PARTICIPANTS_NAME,"גלי");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_PARTICIPANTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_PARTICIPANTS_NAME,"ידיד");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_PARTICIPANTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_PARTICIPANTS_NAME,"מתן");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_PARTICIPANTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_PARTICIPANTS_NAME,"חיל");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_PARTICIPANTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"כדורסל");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,180);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"month");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cc");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_EXTRA,"אפשר להשלים במוצש");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,5);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"21:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,7);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"21:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170413");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170420");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170413");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170504");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170511");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170518");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170525");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170601");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170608");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170615");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170622");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE,"20170629");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_LOCATION,"אולם כדורסל רבין");
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP,-1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_CANCELLED,0);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT,1);
        contentValues.put(DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY,-1);
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_MEETINGS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"קרמיקה");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,2);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,90);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"meeting");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"אפרת גרוסמן");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cheque");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,2);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,1);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"19:30");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"שפר");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,2);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,1700);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"all");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"בורג");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cheque");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,3);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,3);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"20:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"סייבר");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,3);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,2200);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"all");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"ישיבת הדרום");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cc");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,4);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,3);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"17:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"בר מצוה");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,3);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,80);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"meeting");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"תומר גרוסמן");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cheque");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,5);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,7);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"15:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"מתמטיקה בר אילן");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,3);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,1500);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"all");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"דה שליט");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cc");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,6);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,4);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"16:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_NAME,"מחוננים");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID,3);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST,1700);
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE,"all");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_LOCATION,"אורט רחובות");
        contentValues.put(DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD,"cheque");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_SUBJECTS,null,contentValues);

        contentValues = new ContentValues();
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID,7);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK,6);
        contentValues.put(DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY,"08:00");
        contentValues.put(DBConstants.COLUMN_NAME_TIMESTAMP,getTimeStamp());
        mySQLHelper.getWritableDatabase().insert(DBConstants.TABLE_NAME_USUAL_DAYS,null,contentValues);
    }

    public static String getDisplayDayOfWeek(Context context, int dbDayOfWeek) {
        switch (dbDayOfWeek) {
            case 1:
                return context.getResources().getString(R.string.day_of_week_sunday);
            case 2:
                return context.getResources().getString(R.string.day_of_week_monday);
            case 3:
                return context.getResources().getString(R.string.day_of_week_tusday);
            case 4:
                return context.getResources().getString(R.string.day_of_week_wednesday);
            case 5:
                return context.getResources().getString(R.string.day_of_week_thursday);
            case 6:
                return context.getResources().getString(R.string.day_of_week_friday);
            default:
                return context.getResources().getString(R.string.day_of_week_saturday);

        }
    }

    public static long getTimeStamp() {
        return System.currentTimeMillis();
    }

    public static Date getDateFromDBStr(String strDate) {
        SimpleDateFormat df = new SimpleDateFormat(Constants.dbDateFormat);
        Date date = null;
        try {
            date = df.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String getDisplayDateFromDate(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(Constants.displayDateFormat);
        return df.format(date);
    }

    public static boolean getBoolean (int val) {
        if (val==1)
            return true;
        else
            return false;
    }
}
