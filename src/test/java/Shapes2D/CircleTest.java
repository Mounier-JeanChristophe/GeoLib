package Shapes2D;

import Shapes2D.Exceptions.NegativeRadiusException;
import Vectors.Vector2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CircleTest {

    private Circle circle1, circle2, circle3;
    private final double delta = 0.01;
    Vector2 point;

    @Before
    public void init() throws NegativeRadiusException {
        point = new Vector2(0,0);
        circle1 = new Circle(point, 5);
        circle2 = new Circle(point, 0.5);
        circle3 = new Circle(point, 14.158);
    }

    @Test
    public void shouldReturnCirclePerimeter(){
        assertEquals(31.416, circle1.getPerimeter(), delta);
        assertEquals(3.142, circle2.getPerimeter(), delta);
        assertEquals(88.957, circle3.getPerimeter(), delta);
    }

    @Test
    public void shouldReturnCircleArea(){
        assertEquals(78.54, circle1.getArea(), delta);
        assertEquals(0.785, circle2.getArea(), delta);
        assertEquals(629.729, circle3.getArea(), delta);
    }

    @Test
    public void shouldReturnCircleDiameter(){
        assertEquals(10, circle1.getDiameter(), delta);
        assertEquals(1, circle2.getDiameter(), delta);
        assertEquals(28.316, circle3.getDiameter(), delta);
    }

    @Test
    public void shouldRaiseNegativeRadiusException(){
        assertThrows(NegativeRadiusException.class, () -> new Circle(point,-1));
    }
}
