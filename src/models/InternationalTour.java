package models;

// package models;

public class InternationalTour extends Tour {
    public InternationalTour(String destination, double price) {
        super(destination, price);
    }

    @Override
    public void showDetails() {
        System.out.println("International Tour: " + getDestination() + " - $" + getPrice());
    }
}

