import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Flight> flights;
    private ArrayList<Plane> fleet;
    private ArrayList<Booking> bookings;


    public Airline(String name){
        this.name = name;
        this.flights = new ArrayList<>();
        this.fleet = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }


    public String getAirlineName(){
        return this.name;
    }

    public void createFlight(Flight flight){
        this.flights.add(flight);
    }

    public int getFlights(){
        return this.flights.size();
    }

    public int getBookings(){
        return this.bookings.size();
    }

    public int getFleetNumber(){
        return this.fleet.size();
    }

    public void addAircraft(Plane plane){
        this.fleet.add(plane);
    }

    public void populateFleet(){
        for (PlaneType plane : PlaneType.values()){
            Plane individualPlane = new Plane(plane);
            this.fleet.add(individualPlane);
        }
    }





}
