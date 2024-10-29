package models;

// package models;

public class LuxuryTour extends Tour {
    private final boolean privateTransportIncluded;

    public LuxuryTour(String destination, double price) {
        super(destination, price);
        this.privateTransportIncluded = true;  // Example feature for luxury tours
    }

    @Override
    public void showDetails() {
        System.out.println("Tour Destination: " + getDestination());
        System.out.println("Tour Price: $" + getPrice());
        System.out.println("Includes Private Transport: " + privateTransportIncluded);
    }
}

