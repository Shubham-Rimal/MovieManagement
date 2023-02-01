package Models;

import java.util.ArrayList;

public class Category extends MainCategory{
    ArrayList<String> genres;

    public Category(boolean sofa, boolean seat, ArrayList<String> genres) {
        super(sofa, seat);
        this.genres = genres;
    }

}
