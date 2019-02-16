import java.util.ArrayList;

public class Airline {

    private String name;
    private ArrayList<Flight> flights;
    private ArrayList<Plane> fleet;



    public Airline(String name){
        this.name = name;
        this.flights = new ArrayList<>();
        this.fleet = new ArrayList<>();
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








}
