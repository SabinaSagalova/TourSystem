package services;

import models.Tour;

// package services;

import models.Tour;

public class BookingService {
    private static BookingService instance;

    private BookingService() {}

    public static BookingService getInstance() {
        if (instance == null) {
            instance = new BookingService();
        }
        return instance;
    }

    public void bookTour(Tour tour) {
        System.out.printf("Tour booked to %s for $%.2f%n", tour.getDestination(), tour.getPrice());
    }
}
