package services;

import models.*;
import java.util.ArrayList;
import java.util.List;

// package services;

public class TourManager {
    private final List<Tour> predefinedTours = new ArrayList<>();

    public TourManager() {
        initializeTours();
    }

    // Initialize predefined tours
    private void initializeTours() {
        predefinedTours.add(new DomesticTour("Paris", 800));
        predefinedTours.add(new DomesticTour("Barcelona", 600));
        predefinedTours.add(new DomesticTour("New York", 750));
        predefinedTours.add(new InternationalTour("Rome", 1200));
        predefinedTours.add(new InternationalTour("Tokyo", 1500));
        predefinedTours.add(new InternationalTour("Dubai", 2000));
    }

    // Get available tours based on city and budget
    public List<Tour> getAvailableTours(City city, double budget) {
        List<Tour> affordableTours = new ArrayList<>();
        for (Tour tour : predefinedTours) {
            if (tour.getDestination().equalsIgnoreCase(city.name()) && tour.getPrice() <= budget) {
                affordableTours.add(tour);
            }
        }
        return affordableTours;
    }
}
