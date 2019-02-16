import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Plane plane1;
    Route route1;

    @Before

    public void before() {
        airline = new Airline("CodeClan Airways");
        plane1 = new Plane(PlaneType.BOEING747);
        route1 = new Route("Rome", 2500);
        flight = new Flight (plane1, 101, route1);
    }

    @Test
    public void canGetAirlineName(){
        assertEquals("CodeClan Airways", airline.getAirlineName());
    }

    @Test
    public void canAddFlight(){
        airline.createFlight(flight);
        assertEquals(1, airline.getFlights());
    }


    @Test
    public void fleetStartsEmpty(){
        assertEquals(0, airline.getFleetNumber());
    }

    @Test
    public void canAddAircraftToFleet(){
        airline.addAircraft(plane1);
        assertEquals(1, airline.getFleetNumber());
    }

    @Test
    public void canPopulateFleet(){
        airline.populateFleet();
        assertEquals(6, airline.getFleetNumber());
    }


}
