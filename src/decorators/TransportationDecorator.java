package decorators;
import models.Tour;
public class TransportationDecorator extends TourDecorator {
    private static final double TRANSPORTATION_COST = 100;

    public TransportationDecorator(Tour tour) {
        super(tour);
    }

    @Override
    public void showDetails() {
        tour.showDetails();
        System.out.println(" + Includes transportation ($" + TRANSPORTATION_COST + ")");
    }

    @Override
    public double getPrice() {
        return tour.getPrice() + TRANSPORTATION_COST;
    }
}


