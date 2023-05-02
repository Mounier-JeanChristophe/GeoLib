package Shapes2D;

import Vectors.Vector2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    Vector2 p1, p2, p3, p4;
    Double delta = 0.01;

    @Before
    public void init(){
        p1 = new Vector2(1, 2);
        p2 = new Vector2(-3, 5);
        p3 = new Vector2(3, -2);
        p4 = new Vector2(-7, -4);
    }

    @Test
    public void shouldReturnXCoordinate(){
        assertEquals(1, p1.getX(), delta);
    }

    @Test
    public void shouldReturnYCoordinate(){
        assertEquals(2, p1.getY(), delta);
    }

    @Test
    public void shouldReturnDistanceBetween2Points(){
        assertEquals(5, p1.getDistance(p2),delta);
        assertEquals( 9.849, p2.getDistance(p4),delta);
        assertEquals( 4.472, p3.getDistance(p1),delta);
        assertEquals(  10.198 , p4.getDistance(p3),delta);
    }

}
