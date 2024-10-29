package models;

// package models;

public abstract class Tour {
    private final String destination;
    private final double price;

    public Tour(String destination, double price) {
        this.destination = destination;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    // Abstract method that subclasses must implement
    public abstract void showDetails();
}
