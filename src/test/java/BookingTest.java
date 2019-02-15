import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;

    @Before

    public void before(){
        booking = new Booking("Terry", 105,"Rome", 1);
    }

    @Test
    public void canGetBookingName(){
        assertEquals("Terry", booking.getBookingName());
    }

    @Test
    public void canGetBookingFlightNumber(){
        assertEquals(105, booking.getBookingFlightNumber());
    }

    @Test
    public void canGetBookingDestination(){
        assertEquals("Rome", booking.getBookingDestination());
    }

    @Test
    public void canGetBookingLuggageAllowance(){
        assertEquals(1, booking.getBookingLuggageAllowance());
    }
}
