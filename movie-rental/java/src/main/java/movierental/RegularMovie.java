package movierental;

/**
 * Created by wyr on 2015/5/21.
 */
public class RegularMovie extends Rental {
    public RegularMovie(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @java.lang.Override
    public void dealWithAmount() {
        thisAmount += 2;
        if (getDaysRented() > 2)
            thisAmount += (getDaysRented() - 2) * 1.5;
    }
}
