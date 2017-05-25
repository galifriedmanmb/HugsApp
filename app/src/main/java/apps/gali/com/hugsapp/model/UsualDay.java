package apps.gali.com.hugsapp.model;

import apps.gali.com.hugsapp.controller.Utils;

/**
 * Created by 1 on 5/18/2017.
 */

public class UsualDay extends GeneralRecord{
    int dayOfWeek;
    String timeOfDay;

    public UsualDay(int dayOfWeek, String timeOfDay) {
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }
}
