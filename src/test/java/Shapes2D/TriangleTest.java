package Shapes2D;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import Shapes2D.Exceptions.SameCoordinateException;
import Vectors.Vector2;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

    Triangle triangle;
    Vector2 p1,p2,p3;

    @Before
    public void init() throws SameCoordinateException {
        p1 = new Vector2(0,0);
        p2 = new Vector2(3,2);
        p3 = new Vector2(4,-1);
        triangle = new Triangle(p1, p2, p3);
    }

    @Test
    public void shouldReturnTrianglePerimeter(){
        assertEquals(10.9,triangle.getPerimeter(),0.1);
    }

    @Test
    public void shouldReturnTriangleArea(){
        assertEquals(5.5,triangle.getArea(),0.01);
    }

    @Test
    public void shouldReturnSameCoordinateExceptionWhenBadCoordinate(){
        assertThrows(SameCoordinateException.class, () -> new Triangle(p1,p2,p1));
    }

}
