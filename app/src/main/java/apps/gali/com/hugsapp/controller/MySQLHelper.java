package apps.gali.com.hugsapp.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import apps.gali.com.hugsapp.model.DBConstants;

/**
 * Created by 1 on 5/18/2017.
 */

public class MySQLHelper extends SQLiteOpenHelper {

    public MySQLHelper(Context context) {
        super(context, "hugs.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlCreateParticipants = "CREATE TABLE "+DBConstants.TABLE_NAME_PARTICIPANTS+" ("+
                DBConstants.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                DBConstants.COLUMN_NAME_PARTICIPANTS_NAME+" TEXT NOT NULL, "+
                DBConstants.COLUMN_NAME_PARTICIPANTS_EXTRA+" TEXT, "+
                DBConstants.COLUMN_NAME_TIMESTAMP+" INTEGER NOT NULL)";
        Log.d("SQL",sqlCreateParticipants);
        db.execSQL(sqlCreateParticipants);

        String sqlCreateSubjects = "CREATE TABLE "+DBConstants.TABLE_NAME_SUBJECTS+" ("+
                DBConstants.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                DBConstants.COLUMN_NAME_SUBJECTS_NAME+" TEXT NOT NULL, "+
                DBConstants.COLUMN_NAME_SUBJECTS_PARTICIPANT_ID+" INTEGER NOT NULL, "+
                DBConstants.COLUMN_NAME_SUBJECTS_COST+" REAL, "+
                DBConstants.COLUMN_NAME_SUBJECTS_COST_TYPE+" TEXT, "+
                DBConstants.COLUMN_NAME_SUBJECTS_LOCATION+" TEXT, "+
                DBConstants.COLUMN_NAME_SUBJECTS_DEFAULT_METHOD+" TEXT, "+
                DBConstants.COLUMN_NAME_SUBJECTS_ARCHIVED+" TEXT, "+
                DBConstants.COLUMN_NAME_SUBJECTS_EXTRA+" TEXT, "+
                DBConstants.COLUMN_NAME_TIMESTAMP+" INTEGER NOT NULL)";
        Log.d("SQL",sqlCreateSubjects);
        db.execSQL(sqlCreateSubjects);

        String sqlCreateUsualDays = "CREATE TABLE "+DBConstants.TABLE_NAME_USUAL_DAYS+" ("+
                DBConstants.COLUMN_NAME_USUAL_DAYS_SUBJECT_ID+" INTEGER NOT NULL, "+
                DBConstants.COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK+" INTEGER NOT NULL, "+
                DBConstants.COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY+" TEXT, "+
                DBConstants.COLUMN_NAME_TIMESTAMP+" INTEGER NOT NULL)";
        Log.d("SQL",sqlCreateUsualDays);
        db.execSQL(sqlCreateUsualDays);

        String sqlCreateMeetings = "CREATE TABLE "+DBConstants.TABLE_NAME_MEETINGS+" ("+
                DBConstants.COLUMN_NAME_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                DBConstants.COLUMN_NAME_MEETINGS_SUBJECT_ID+" INTEGER NOT NULL, "+
                DBConstants.COLUMN_NAME_MEETINGS_PAYMENT_ID+" INTEGER, "+
                DBConstants.COLUMN_NAME_MEETINGS_SCHEDULED_DATE+" TEXT, "+
                DBConstants.COLUMN_NAME_MEETINGS_LOCATION+" TEXT, "+
                DBConstants.COLUMN_NAME_MEETINGS_SHOW_UP+" INTEGER, "+
                DBConstants.COLUMN_NAME_MEETINGS_CANCELLED+" INTEGER NOT NULL, "+
                DBConstants.COLUMN_NAME_MEETINGS_CANCEL_EXTRA+" TEXT, "+
                DBConstants.COLUMN_NAME_MEETINGS_REPLACED_BY+" INTEGER, "+
                DBConstants.COLUMN_NAME_MEETINGS_FOR_PAYMENT+" INTEGER, "+
                DBConstants.COLUMN_NAME_MEETINGS_EXTRA+" TEXT, "+
                DBConstants.COLUMN_NAME_TIMESTAMP+" INTEGER NOT NULL)";
        Log.d("SQL",sqlCreateMeetings);
        db.execSQL(sqlCreateMeetings);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
