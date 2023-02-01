package Models;


import java.util.ArrayList;

public class Movie extends Category{
    String Name;
    String Director;
    String ShowTime;
    double SofaPrice;
    double SeatPrice;

    public Movie(boolean sofa, boolean seat, ArrayList<String> genres, String name, String director, String showTime, double sofaPrice, double seatPrice) {
        super(sofa, seat, genres);
        Name = name;
        Director = director;
        ShowTime = showTime;
        SofaPrice = sofaPrice;
        SeatPrice = seatPrice;
    }

    public String getMovieDetail() {
        System.out.println("\n\n--------------MOVIE DETAIL--------------");
        System.out.println("Movie Name: "+this.Name);
        System.out.println("Director: "+this.Director);
        System.out.println("Showtime: "+this.ShowTime);
        if(this.sofa){
            System.out.println("Sofa: Available");
            System.out.println("Sofa Price: "+ this.SofaPrice);
        }else {
            System.out.println("Sofa: Houseful");
        }

        if(this.seat){
            System.out.println("Seat: Available");
            System.out.println("Seat Price: "+this.SeatPrice);
        }else {
            System.out.println("Seat: Houseful");
        }
        System.out.println("Genres: ");
        return MovieDetail;
    }

    public void setMovieDetail(String movieDetail) {
        MovieDetail = movieDetail;
    }

    String MovieDetail;

    String movies;
    String specificMovie;

    public String getMovies() {
        System.out.println(this.Name+"=> "+this.ShowTime);
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public String getSpecificMovie(String s) {
        if (this.ShowTime.equals(ShowTime)){
            System.out.println("\n"+this.Name+" is directed by "+this.Director+" and will start screening at "+this.ShowTime+".");
        }
        return specificMovie;
    }

    public void setSpecificMovie(String specificMovie) {
        this.specificMovie = specificMovie;
    }

    public String getName() {
        return Name;
    }

    public String getDirector() {
        return Director;
    }

    public String getShowTime() {
        return ShowTime;
    }

    public double getSofaPrice() {
        return SofaPrice;
    }

    public double getSeatPrice() {
        return SeatPrice;
    }
}
