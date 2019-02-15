import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before

    public void before(){
        passenger = new Passenger("Rick", 2);
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

//    pax can make a new booking
}
