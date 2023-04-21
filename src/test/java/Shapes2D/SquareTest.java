package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    Point p1, p2, p3, p4;
    Square square;

    @Before
    public void init() throws DistanceException {
        p1 = new Point(0,0);
        p2 = new Point(0,0.158);
        p3 = new Point(-0.158,0);
        p4 = new Point(-0.158,0.158);
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
        Point p = new Point(2,3);
        assertThrows(DistanceException.class, () -> new Square(p,p1,p2,p3));
        assertThrows(DistanceException.class, () -> new Rectangle(p1,p,p2,p3));
    }
}
