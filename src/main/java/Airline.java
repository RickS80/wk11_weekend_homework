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


}
