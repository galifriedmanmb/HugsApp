package apps.gali.com.hugsapp.model;

import java.util.Date;

/**
 * Created by 1 on 5/18/2017.
 */

public class Payment extends GeneralRecord {
    private int id;
    Subject subject;
    double amount;
    String method;
    Date dateGiven;
    Date dateDue;
    Date dateCollected;
    String extra;

    public Payment(int id) {
        this.id = id;
    }

    public Payment(int id, Subject subject, double amount, String method, Date dateGiven, Date dateDue, Date dateCollected, String extra) {
        this.id = id;
        this.subject = subject;
        this.amount = amount;
        this.method = method;
        this.dateGiven = dateGiven;
        this.dateDue = dateDue;
        this.dateCollected = dateCollected;
        this.extra = extra;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setDateGiven(Date dateGiven) {
        this.dateGiven = dateGiven;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public void setDateCollected(Date dateCollected) {
        this.dateCollected = dateCollected;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public int getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public Date getDateGiven() {
        return dateGiven;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public Date getDateCollected() {
        return dateCollected;
    }

    public String getExtra() {
        return extra;
    }
}
