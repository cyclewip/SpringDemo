package co.edureka;

import java.util.List;
import java.util.Map;

public class BookDate {
    String date;
    boolean booked = false;
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BookDate(String date) {
        this.booked = booked;
        this.date = date;
    }

    public boolean isBooked() {
        return booked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }
}
