package apps.gali.com.hugsapp.model;

import android.graphics.Bitmap;

import java.util.ArrayList;

/**
 * Created by 1 on 5/18/2017.
 */

public class Participant extends GeneralRecord {
    private int id;
    String name;
    String extra;

    ArrayList<Subject> subjects;

    public Participant(int id, String name, String extra) {
        this.id = id;
        this.name = name;
        this.extra = extra;
        subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public String getExtra() {
        return extra;
    }
}
