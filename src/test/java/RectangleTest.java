import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    Point p1,p2,p3,p4;
    Rectangle rectangle;

    @Before
    public void init(){
        p1 = new Point(0,0);
        p2 = new Point(0,3);
        p3 = new Point(6,0);
        p4 = new Point(6,3);
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
    public void shouldRaiseRectangleExceptionWhenBadCoordinates(){
        // to implement
    }
}
