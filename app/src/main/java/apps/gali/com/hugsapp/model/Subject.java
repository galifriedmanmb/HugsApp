package apps.gali.com.hugsapp.model;

import java.util.ArrayList;

/**
 * Created by 1 on 5/18/2017.
 */

public class Subject extends GeneralRecord{
    private int id;
    Participant participant;
    String name;
    double cost;
    String costType;
    String location;
    ArrayList<UsualDay> usualDays;
    String defaultMethod;
    boolean archived;
    String extra;

    ArrayList<Meeting> meetings;
    ArrayList<Payment> payments;

    public Subject(int id, String name) {
        this.id = id;
        this.name = name;
        this.usualDays = new ArrayList<>();
        this.meetings = new ArrayList<>();
        this.payments = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getCostType() {
        return costType;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<UsualDay> getUsualDays() {
        return usualDays;
    }

    public String getDefaultMethod() {
        return defaultMethod;
    }

    public boolean isArchived() {
        return archived;
    }

    public String getExtra() {
        return extra;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDefaultMethod(String defaultMethod) {
        this.defaultMethod = defaultMethod;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setUsualDays(ArrayList<UsualDay> usualDays) {
        this.usualDays = usualDays;
    }

    public void setMeetings(ArrayList meetings) {
        this.meetings = meetings;
    }

    public void setPayments(ArrayList payments) {
        this.payments = payments;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

}
