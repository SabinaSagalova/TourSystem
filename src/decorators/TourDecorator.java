package decorators;

import models.Tour;

// Abstract class for tour decorators
public abstract class TourDecorator extends Tour {
    protected Tour tour;

    public TourDecorator(Tour tour) {
        super(tour.getDestination(), tour.getPrice());
        this.tour = tour;
    }

    public abstract void showDetails();
}

