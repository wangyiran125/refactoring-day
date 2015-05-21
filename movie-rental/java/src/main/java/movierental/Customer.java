package movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private RentalReport rentalReport = new RentalReport();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public void dealWithResult() {

        rentalReport.report();

    }

    public String getRentalResult(){
        dealWithResult();
        rentalReport.getReport();
    }


}
