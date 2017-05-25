package apps.gali.com.hugsapp.model;

import java.util.Date;

/**
 * Created by 1 on 5/18/2017.
 */

public class Meeting extends GeneralRecord {
    private int id;
    Subject subject;
    Payment payment;
    Date scheduledDate;
    String location;
    int showUp;
    boolean cancelled;
    String cancelExtra;
    int replacedBy;
    boolean forPayment;
    String extra;

    public Meeting(int id, Subject subject, Payment payment, Date scheduledDate, String location, int showUp, boolean cancelled, String cancelExtra, int replacedBy, boolean forPayment, String extra) {
        this.id = id;
        this.subject = subject;
        this.payment = payment;
        this.scheduledDate = scheduledDate;
        this.location = location;
        this.showUp = showUp;
        this.cancelled = cancelled;
        this.cancelExtra = cancelExtra;
        this.replacedBy = replacedBy;
        this.forPayment = forPayment;
        this.extra = extra;
    }

    public int getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public Payment getPayment() {
        return payment;
    }

    public Date getScheduledDate() {
        return scheduledDate;
    }

    public String getLocation() {
        return location;
    }

    public int getShowUp() {
        return showUp;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public String getCancelExtra() {
        return cancelExtra;
    }

    public int getReplacedBy() {
        return replacedBy;
    }

    public boolean isForPayment() {
        return forPayment;
    }

    public String getExtra() {
        return extra;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setScheduledDate(Date scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setShowUp(int showUp) {
        this.showUp = showUp;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void setCancelExtra(String cancelExtra) {
        this.cancelExtra = cancelExtra;
    }

    public void setReplacedBy(int replacedBy) {
        this.replacedBy = replacedBy;
    }

    public void setForPayment(boolean forPayment) {
        this.forPayment = forPayment;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
