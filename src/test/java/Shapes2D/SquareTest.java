package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;
import Vectors.Vector2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Vector2 p1, p2, p3, p4;
    Square square;

    @Before
    public void init() throws DistanceException {
        p1 = new Vector2(0,0);
        p2 = new Vector2(0,0.158);
        p3 = new Vector2(-0.158,0);
        p4 = new Vector2(-0.158,0.158);
        square = new Square(p1,p2,p3,p4);
    }

    @Test
    public void shouldReturnSquarePerimeter(){
        assertEquals(0.632, square.getPerimeter(), 0);
    }

    @Test
    public void shouldReturnSquareArea(){
        assertEquals(0.024964, square.getArea(), 0);
    }

    @Test
    public void shouldRaiseDistanceException(){
        Vector2 p = new Vector2(2,3);
        assertThrows(DistanceException.class, () -> new Square(p,p1,p2,p3));
        assertThrows(DistanceException.class, () -> new Rectangle(p1,p,p2,p3));
    }
}
