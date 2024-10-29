package models;

// package models;

public class PremiumTour extends Tour {
    private final boolean mealsIncluded;

    public PremiumTour(String destination, double price) {
        super(destination, price);
        this.mealsIncluded = true;  // Example feature for premium tours
    }

    @Override
    public void showDetails() {
        System.out.println("Premium Tour: " + getDestination() + " - $" + getPrice());
        System.out.println("Includes Meals: " + mealsIncluded);
    }
}




