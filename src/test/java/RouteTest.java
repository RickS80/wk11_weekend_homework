import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RouteTest {

//    this.destination = destination;
//        this.distanceFromHub = distanceFromHub;
    Route route1;
    Route route2;


    @Before
    public void before(){
        route1 = new Route("Rome", 1000);
        route2 = new Route("Hong Kong", 6000);
    }

    @Test
    public void canGetDestination(){
        assertEquals("Rome", route1.getDestination());
    }

    @Test
    public void canGetDistance(){
        assertEquals(6000, route2.getDistance());
    }


}
