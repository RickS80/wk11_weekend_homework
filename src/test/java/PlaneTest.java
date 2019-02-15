import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before

    public void before(){
        plane1 = new Plane(PlaneType.AIRBUSA380, 100, 8000 );
        plane2 = new Plane(PlaneType.BOEING737, 10, 1000 );
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.AIRBUSA380, plane1.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity(){
       assertEquals(150, plane2.getPlaneCapacity());
    }

    @Test
    public void canGetBaggageCapacity(){
        assertEquals(10, plane2.getBaggageCapacity());
    }

    @Test
    public void canGetRange(){
        assertEquals(1000, plane2.getRange());
    }


}
