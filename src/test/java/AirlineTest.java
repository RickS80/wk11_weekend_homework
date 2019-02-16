import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirlineTest {

    Airline airline;
    Flight flight;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Route route1;
    ArrayList<PlaneType> largePlanes;
    Booking booking;
    Booking booking2;

    @Before

    public void before() {
        airline = new Airline("CodeClan Airways");
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUSA380);
        plane3 = new Plane(PlaneType.AIRBUSA350);
        plane4 = new Plane(PlaneType.BOEING777);
        largePlanes = new ArrayList<PlaneType>();
        largePlanes.add(plane1.getPlaneType());
        largePlanes.add(plane4.getPlaneType());
        largePlanes.add(plane2.getPlaneType());
        largePlanes.add(plane3.getPlaneType());
        route1 = new Route("Rome", 2500);
        flight = new Flight (plane1, 101, route1);
        flight2 = new Flight (plane2, 103, route1);
        airline.createFlight(flight);
        airline.createFlight(flight2);
        booking = new Booking("Terry", 101,"Rome", 1);
        booking2 = new Booking("Gary", 103,"Dusseldorf", 1);
        flight.addBookingToFlight(booking);
        flight2.addBookingToFlight(booking2);
    }

    @Test
    public void canGetAirlineName(){
        assertEquals("CodeClan Airways", airline.getAirlineName());
    }

    @Test
    public void canAddFlight(){
        assertEquals(2, airline.getFlights());
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

    @Test
    public void whichAircraftCanFlyRoute(){
        airline.populateFleet();
        assertEquals(largePlanes, airline.checkWhichAircraftMeetsRange(route1));
    }

    @Test
    public void findMostSuitablePlaneForRoute(){
        airline.populateFleet();
        assertEquals("AIRBUSA350", airline.mostSuitablePlane(route1));
    }

    @Test
    public void checkTotalBookings(){
        assertEquals(2, airline.totalBookings());
    }
}
