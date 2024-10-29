package services;

import models.*;

// package services;

import models.Tour;

public class TourFactory {
    public static Tour createTour(String type, String destination, double price) {
        switch (type.toLowerCase()) {
            case "domestic":
                return new DomesticTour(destination, price);
            case "international":
                return new InternationalTour(destination, price);
            case "premium":
                return new PremiumTour(destination, price);
            case "luxury":
                return new LuxuryTour(destination, price);
            default:
                throw new IllegalArgumentException("Unknown tour type: " + type);
        }
    }
}
