package movierental;

/**
 * Created by wyr on 2015/5/21.
 */
public class RentalReport {
    private double totalAmount;
    private int totalFrequentRenterPoints;
    private String result;
    private List<Rental> _rentals = new ArrayList<Rental>();

    public void report() {
        computeRental();
        setTotalAmount();
        setResult();
    }

    private void computeRental() {
        for (Rental each : _rentals) {
            each.compute();
        }
    }

    private void setTotalAmount() {
        for (Rental each : _rentals) {
            totalAmount += each.getThisAmount();
        }
    }

    private void setResult() {
        result = "Rental Record for " + getName() + "\n";
        for (Rental each : _rentals) {
            result += each.getResult();
        }
        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
    }

    public java.lang.Object getReport() {
        return result;
    }
}
