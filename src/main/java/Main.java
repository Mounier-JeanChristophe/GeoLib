import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;
import Vectors.Vector2;
import Vectors.Vector3;
import Shapes2D.Rectangle;
import Shapes2D.Square;
import Shapes2D.Triangle;

public class Main {

    public static void main(String[] args) throws SameCoordinateException, DistanceException {

        Vector2 vector21 = new Vector2(0,0);
        Vector2 vector22 = new Vector2(3,0);
        Vector2 vector23 = new Vector2(3,3);

        Triangle triangle = new Triangle(vector22, vector23, vector21);
        System.out.println("Perimeter = "+triangle.getPerimeter());

        Vector2 vector24 = new Vector2(0,3);
        Rectangle rectangle = new Rectangle(vector21, vector22, vector23, vector24);
        Square square = new Square(vector21, vector22, vector23, vector24);

    }

}
