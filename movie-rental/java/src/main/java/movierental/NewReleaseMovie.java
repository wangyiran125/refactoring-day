package movierental;

/**
 * Created by wyr on 2015/5/21.
 */
public class NewReleaseMovie extends Rental{
    public NewReleaseMovie(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @java.lang.Override
    public void dealWithAmount() {
        thisAmount += getDaysRented() * 3;
    }
}
