package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;
import Vectors.Vector2;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RectangleTest {

    Vector2 p1,p2,p3,p4;
    Rectangle rectangle;

    @Before
    public void init() throws DistanceException {
        p1 = new Vector2(0,0);
        p2 = new Vector2(0,3);
        p3 = new Vector2(6,0);
        p4 = new Vector2(6,3);
        rectangle = new Rectangle(p1,p2,p3,p4);
    }

    @Test
    public void shouldReturnRectanglePerimeter(){
        assertEquals(18, rectangle.getPerimeter(),0);
    }

    @Test
    public void shouldReturnRectangeArea(){
        assertEquals(18, rectangle.getArea(),0);
    }

    @Test
    public void shouldRaiseDistanceExceptionWhenBadCoordinates(){
        Vector2 pTest = new Vector2(2,-1);
        assertThrows(DistanceException.class, () -> new Rectangle(p1, pTest, p3, p4));
        assertThrows(DistanceException.class, () -> new Rectangle(pTest, p1, p3, p4));
    }
}
