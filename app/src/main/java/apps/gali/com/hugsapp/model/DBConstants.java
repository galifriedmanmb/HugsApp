package apps.gali.com.hugsapp.model;

/**
 * Created by 1 on 5/18/2017.
 */

public class DBConstants {

    public static final String COLUMN_NAME_ID = "_id";
    public static final String COLUMN_NAME_TIMESTAMP = "timestamp";

    public static final String TABLE_NAME_PARTICIPANTS = "participants";
    public static final String COLUMN_NAME_PARTICIPANTS_NAME = "name";
    public static final String COLUMN_NAME_PARTICIPANTS_EXTRA = "extra";

    public static final String TABLE_NAME_SUBJECTS = "subjects";
    public static final String COLUMN_NAME_SUBJECTS_NAME = "name";
    public static final String COLUMN_NAME_SUBJECTS_PARTICIPANT_ID = "participant_id";
    public static final String COLUMN_NAME_SUBJECTS_COST = "cost";
    public static final String COLUMN_NAME_SUBJECTS_COST_TYPE = "cost_type";
    public static final String COLUMN_NAME_SUBJECTS_LOCATION = "location";
    public static final String COLUMN_NAME_SUBJECTS_DEFAULT_METHOD = "default_method";
    public static final String COLUMN_NAME_SUBJECTS_ARCHIVED = "archived";
    public static final String COLUMN_NAME_SUBJECTS_EXTRA = "extra";

    public static final String TABLE_NAME_USUAL_DAYS = "usual_days";
    public static final String COLUMN_NAME_USUAL_DAYS_SUBJECT_ID = "subject_id";
    public static final String COLUMN_NAME_USUAL_DAYS_DAY_OF_WEEK = "day_of_week";
    public static final String COLUMN_NAME_USUAL_DAYS_TIME_OF_DAY = "time_of_day";

    public static final String TABLE_NAME_MEETINGS = "meetings";
    public static final String COLUMN_NAME_MEETINGS_SUBJECT_ID = "subject_id";
    public static final String COLUMN_NAME_MEETINGS_PAYMENT_ID = "payment_id";
    public static final String COLUMN_NAME_MEETINGS_SCHEDULED_DATE = "scheduled_date";
    public static final String COLUMN_NAME_MEETINGS_LOCATION = "location";
    public static final String COLUMN_NAME_MEETINGS_SHOW_UP = "show_up";
    public static final String COLUMN_NAME_MEETINGS_CANCELLED = "cancelled";
    public static final String COLUMN_NAME_MEETINGS_CANCEL_EXTRA = "cancel_extra";
    public static final String COLUMN_NAME_MEETINGS_REPLACED_BY = "replaced_by";
    public static final String COLUMN_NAME_MEETINGS_FOR_PAYMENT = "for_payment";
    public static final String COLUMN_NAME_MEETINGS_EXTRA = "extra";

    public static final String TABLE_NAME_PAYMENTS = "payments";
    public static final String COLUMN_NAME_PAYMENTS_SUBJECT_ID = "subject_id";
    public static final String COLUMN_NAME_PAYMENTS_AMOUNT = "amount";
    public static final String COLUMN_NAME_PAYMENT_METHOD = "method";
    public static final String COLUMN_NAME_PAYMENT_DATE_GIVEN = "date_given";
    public static final String COLUMN_NAME_PAYMENT_DATE_DUE = "date_due";
    public static final String COLUMN_NAME_PAYMENT_DATE_COLLECTED = "date_collected";
    public static final String COLUMN_NAME_PAYMENT_EXTRA = "extra";

}
