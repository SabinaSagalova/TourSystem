package models;

// package models;

public class DomesticTour extends Tour {
    public DomesticTour(String destination, double price) {
        super(destination, price);
    }

    @Override
    public void showDetails() {
        System.out.println("Domestic Tour: " + getDestination() + " - $" + getPrice());
    }
}



