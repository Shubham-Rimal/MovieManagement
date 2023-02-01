import Models.Movie;
import Models.Seat;
import Models.Ticket;
import Models.User;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> genres = new ArrayList<>();
        genres.add("Sci-Fi");
        genres.add("Adventure");
        genres.add("Drama");
        genres.add("Historical");
        genres.add("Action");
        genres.add("Thriller");
        genres.add("Fantasy");
        genres.add("Romance");

        ArrayList<String> avatar = new ArrayList<>();
        avatar.add(genres.get(0));
        avatar.add(genres.get(2));
        avatar.add(genres.get(4));
        avatar.add(genres.get(6));
        avatar.add(genres.get(1));

        ArrayList<String> kgf2 = new ArrayList<>();
        kgf2.add(genres.get(2));
        kgf2.add(genres.get(5));
        kgf2.add(genres.get(4));
        kgf2.add(genres.get(7));

        ArrayList<String> psI = new ArrayList<>();
        psI.add(genres.get(1));
        psI.add(genres.get(2));
        psI.add(genres.get(3));
        psI.add(genres.get(4));
        psI.add(genres.get(7));

        Movie m1 = new Movie(true, true, avatar, "Avatar: The Way of Water", "James Cameron", "14:00 PM", 650, 450);
        Movie m2 = new Movie(true, true, kgf2, "KGF: Chapter 2", "Prasanta Neel", "19:30 PM", 750, 500);
        Movie m3 = new Movie(true, true, psI, "Ponniyin Selvan: I", "James Cameron", "16:15 PM", 550, 300);


        m1.getMovieDetail();
        for (String singleAvatar: avatar){
            System.out.println("-"+singleAvatar);
        }

        m2.getMovieDetail();
        for (String singleKgf2: kgf2){
            System.out.println("-"+singleKgf2);
        }

        m3.getMovieDetail();
        for (String singlePsI: psI){
            System.out.println("-"+singlePsI);
        }

        System.out.println("\n\n-----------------------Movies And Showtime-----------------------");
        m1.getMovies();
        m2.getMovies();
        m3.getMovies();

        System.out.println("\n\n-----------------------Specific Showtime-----------------------");
        m1.getSpecificMovie("14:00 PM");

        User u1 = new User("Bikarsha Ojha", 1023, "biksojha@gmail.com");
        User u2 = new User("Shubham Rimal", 1034, "shubrims@gmail.com");
        User u3 = new User("Om Thapa", 1056, "omthapa@gmail.com");

        ArrayList<Seat> seatsAvatar = new ArrayList<>();
        seatsAvatar.add(new Seat("H",10));
        seatsAvatar.add(new Seat("H",11));
        seatsAvatar.add(new Seat("H",12));
        seatsAvatar.add(new Seat("H",13));

        ArrayList<Seat> seatsKgf2 = new ArrayList<>();
        seatsKgf2.add(new Seat("J",12));
        seatsKgf2.add(new Seat("J",13));
        seatsKgf2.add(new Seat("J",14));
        seatsKgf2.add(new Seat("J",15));
        seatsKgf2.add(new Seat("J",16));
        seatsKgf2.add(new Seat("J",17));

        ArrayList<Seat> seatsPsI = new ArrayList<>();
        seatsPsI.add(new Seat("G", 5));
        seatsPsI.add(new Seat("G", 6));
        seatsPsI.add(new Seat("G", 7));

        Ticket t1 = new Ticket(u1.getUser_id(), m1.getName(), m1.getShowTime(), seatsAvatar);
        Ticket t2 = new Ticket(u2.getUser_id(), m2.getName(), m2.getShowTime(), seatsKgf2);
        Ticket t3 = new Ticket(u3.getUser_id(), m3.getName(), m3.getShowTime(), seatsPsI);

    }
}