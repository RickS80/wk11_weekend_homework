import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private ArrayList<Passenger> passengers;
    private Route destination;

    public Flight(Plane plane, int flightNumber, Route destination){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getFlightAircraftType(){
        return this.plane.getPlaneType();
    }

    public int getFlightBaggageLimit(){
        return this.plane.getBaggageCapacity();
    }

    public int getFlightAircraftRange(){
        return this.plane.getRange();
    }

    public int getFlightRange(){
        return this.destination.getDistance();
    }

    public String getFlightDestination(){
        return this.destination.getDestination();
    }

    public int getFlightPassengerCount(){
        return this.passengers.size();
    }

    public int getFlightNumber(){
        return this.flightNumber;
    }

    public boolean checkAircraftMeetsRange() {
        if (this.getFlightAircraftRange() > this.getFlightRange())
        return true;
        else {
            return false;
        }
    }


}
