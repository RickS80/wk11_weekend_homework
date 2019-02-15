import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Route route1;
    Passenger passenger;
    Booking booking;


    @Before

    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA380, 100, 5000);
        plane2 = new Plane(PlaneType.AIRBUSA220, 10, 2000);
        route1 = new Route("Rome", 2500);
        flight = new Flight(plane1, 109, route1);
        flight2 = new Flight(plane2, 105, route1);
        passenger = new Passenger("Rick", 2);
        booking = new Booking(passenger.getName(), 109,"Rome", 2);
        passenger.addBooking(booking);

    }

    @Test
    public void getFlightNumber() {
        assertEquals(109, flight.getFlightNumber());
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
    public void checkAircraftCanReachDestination_true(){
        assertEquals(true, flight.checkAircraftMeetsRange());
    }

    @Test
    public void checkAircraftCanReachDestination_false() {
        assertEquals(false, flight2.checkAircraftMeetsRange());
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
    public void verifyPassengerHasBookingOnFlight_pass(){
        assertEquals(true, flight.verifyPassenger(passenger));
    }

    @Test
    public void verifyPassengerHasBookingOnFlight_fail(){
        assertEquals(false, flight2.verifyPassenger(passenger));
    }



    @Test
    public void checkInPassengerToFlight(){
        flight.checkInPassenger(passenger);
       assertEquals(1, flight.getFlightPassengerCount());
    }


  

//  check booking status.
//    check total bookings on flight
//    check outstanding passengers to check in

}
