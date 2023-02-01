package Models;

import java.sql.Time;
import java.util.ArrayList;

public class Ticket {
    int user_id;
    String Movie;
    String showTime;
    ArrayList<Seat> seats;

    public Ticket(int user_id, String movie, String showTime, ArrayList<Seat> seats) {
        this.user_id = user_id;
        Movie = movie;
        this.showTime = showTime;
        this.seats = seats;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getMovie() {
        return Movie;
    }

    public void setMovie(String movie) {
        Movie = movie;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}
