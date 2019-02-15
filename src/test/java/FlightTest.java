import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane1;
    Plane plane2;
    Route route1;

    @Before

    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA380, 100, 5000);
        plane2 = new Plane(PlaneType.AIRBUSA220, 10, 2000);
        route1 = new Route("Rome", 2500);
        flight = new Flight(plane1, 109, route1);
    }

    @Test
    public void canGetFlightPlaneType(){
        assertEquals(PlaneType.AIRBUSA380, flight.getFlightAircraftType());
    }

    @Test
    public void canGetFlightBaggageCapacity(){
        assertEquals(100, flight.getFlightBaggageLimit());
    }

    @Test
    public void canGetFlightAircraftRange(){
        assertEquals(5000, flight.getFlightAircraftRange());
    }

    @Test
    public void canGetFlightRange(){
        assertEquals(2500, flight.getFlightRange());
    }

    @Test
    public void canGetFlightDestination(){
        assertEquals("Rome", flight.getFlightDestination());
    }

    @Test
    public void flightStartsWithZeroPassengers(){
        assertEquals(0, flight.getFlightPassengerCount());
    }

    @Test
    public void getFlightNumber() {
        assertEquals(109, flight.getFlightNumber());
    }

    @Test
    public void checkAircraftCanReachDestination_true(){
        assertEquals(true, flight.checkAircraftMeetsRange());
    }

    @Test
    public void checkAircraftCanReachDestination_false() {
        Flight flight2 = new Flight(plane2, 109, route1);
        assertEquals(false, flight2.checkAircraftMeetsRange());
    }


//    can get plane range
//    can get route destination
//
//    can get route length
//    can check plane range > distance from hub
//    flight starts with zero passengers

}
