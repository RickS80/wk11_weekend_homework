import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    Booking booking;

    @Before

    public void before(){
        passenger = new Passenger("Rick", 2);
        booking = new Booking(passenger.getName(), 105,"Rome", 1);
    }

    @Test
    public void canGetPaxName(){
        assertEquals("Rick", passenger.getName());
    }

    @Test
    public void canGetLuggage(){
        assertEquals(2, passenger.getLuggage());
    }

    @Test
    public void paxStartwithZeroBookings(){
        assertEquals(0,passenger.getBookings());

    }

    @Test
    public void paxCanAddBooking(){
        passenger.addBookingToPassenger(booking);
        assertEquals(1, passenger.getBookings());

    }


}
