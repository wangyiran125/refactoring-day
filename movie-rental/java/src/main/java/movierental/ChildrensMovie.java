package movierental;

/**
 * Created by wyr on 2015/5/21.
 */
public class ChildrensMovie extends Rental{
    public ChildrensMovie(Movie movie, int daysRented) {
        super(movie, daysRented);
    }

    @java.lang.Override
    public void dealWithAmount() {
        thisAmount += 1.5;
        if (getDaysRented() > 3)
            thisAmount += (getDaysRented() - 3) * 1.5;
    }
}
