import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;
import Shapes2D.Point;
import Shapes2D.Rectangle;
import Shapes2D.Square;
import Shapes2D.Triangle;

public class Main {

    public static void main(String[] args) throws SameCoordinateException, DistanceException {

        Point point1 = new Point(0,0);
        Point point2 = new Point(3,0);
        Point point3 = new Point(3,3);

        Triangle triangle = new Triangle(point2,point3,point1);
        System.out.println("Perimeter = "+triangle.getPerimeter());

        Point point4 = new Point(0,3);
        Rectangle rectangle = new Rectangle(point1,point2,point3,point4);
        Square square = new Square(point1,point2,point3,point4);

    }

}
