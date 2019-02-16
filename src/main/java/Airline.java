import java.util.ArrayList;

public class Airline {

    private String airlineName;
    private ArrayList<Flight> flights;
    private ArrayList<Plane> fleet;
    private ArrayList<Booking> bookings;



    public Airline(String name){
        this.airlineName = name;
        this.flights = new ArrayList<>();
        this.fleet = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }


    public String getAirlineName(){
        return this.airlineName;
    }

    public void createFlight(Flight flight){
        this.flights.add(flight);
    }

    public int getFlights(){
        return this.flights.size();
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

    public ArrayList<PlaneType> checkWhichAircraftMeetsRange(Route route) {
        ArrayList<PlaneType> acceptablePlanes = new ArrayList<>();
        for (Plane individualPlane : this.fleet) {
            if (individualPlane.getRange() > route.getDistance()) {
                acceptablePlanes.add(individualPlane.getPlaneType());
            }
        }
        return acceptablePlanes;
    }

    public String mostSuitablePlane(Route route){
        PlaneType mostSuitablePlane = PlaneType.AIRBUSA380;
        ArrayList<PlaneType> shortlistedPlanes = this.checkWhichAircraftMeetsRange(route);
            for (PlaneType individualPlane : shortlistedPlanes){
                if (individualPlane.getRangeFromEnum() < mostSuitablePlane.getRangeFromEnum()){
                    mostSuitablePlane = individualPlane;
                }
            }
            return mostSuitablePlane.name();
    }

    public int totalBookings(){
        int total = 0;
        for (Flight flight : this.flights) {
             total += flight.checkFlightBookings();
            }
        return total;
        }









}
