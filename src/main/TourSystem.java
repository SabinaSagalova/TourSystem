package main;

import models.City;
import models.Tour;
import services.TourManager;
import decorators.TransportationDecorator;

import java.util.List;
import java.util.Scanner;

public class TourSystem {
    private static final TourManager tourManager = new TourManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Select a city from the list:");
        for (City city : City.values()) {
            System.out.println(city.ordinal() + 1 + ". " + city);
        }

        System.out.print("Enter the city number: ");
        int cityChoice = scanner.nextInt();
        scanner.nextLine();

        if (cityChoice < 1 || cityChoice > City.values().length) {
            System.out.println("Invalid city choice. Exiting.");
            return;
        }

        City selectedCity = City.values()[cityChoice - 1];
        List<Tour> affordableTours = tourManager.getAvailableTours(selectedCity, budget);

        System.out.println("\nAvailable tours to " + selectedCity + " within your budget:");
        if (affordableTours.isEmpty()) {
            System.out.println("No available tours within your budget.");
        } else {
            for (Tour tour : affordableTours) {
                tour.showDetails();
            }

            // Ask user if they want transportation
            System.out.print("Would you like to include transportation? (yes/no): ");
            String transportationChoice = scanner.nextLine().trim().toLowerCase();

            Tour selectedTour = affordableTours.get(0); // Select the first tour for simplicity
            if (transportationChoice.equals("yes")) {
                selectedTour = new TransportationDecorator(selectedTour);
            }

            System.out.printf("Total price for the tour to %s: $%.2f%n", selectedTour.getDestination(), selectedTour.getPrice());
        }
        scanner.close();
    }
}
