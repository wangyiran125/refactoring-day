package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public abstract class Rental {

    private Movie _movie;
    private int _daysRented;
    private long frequentRenterPoints;

    public double getThisAmount() {
        return thisAmount;
    }

    protected double thisAmount = 0;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getPriceOfMovie(){
        return _movie.getPriceCode();
    }

    public abstract void dealWithAmount();

    public void dealWithRenterPoint() {
        // add frequent renter points
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((getPriceOfMovie() == Movie.NEW_RELEASE) && getDaysRented() > 1)
            frequentRenterPoints++;

    }

    public String getResult() {
        return   "\t" + getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
    }


    public void compute() {
        dealWithAmount();
        dealWithRenterPoint();
    }
}
