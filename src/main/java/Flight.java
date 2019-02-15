import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private ArrayList<Booking> bookings;
    private Route destination;

    public Flight(Plane plane, int flightNumber, Route destination){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.bookings = new ArrayList<>();
    }

}
