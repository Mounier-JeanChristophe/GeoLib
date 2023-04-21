package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;

/**
 * Square class. A class to create a square and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Square extends Rectangle{

    /**
     * Constructor for creating a square.
     * @param point1 Shapes2D.Point of the square.
     * @param point2 Shapes2D.Point of the square.
     * @param point3 Shapes2D.Point of the square.
     * @param point4 Shapes2D.Point of the square.
     */
    public Square(Point point1, Point point2, Point point3, Point point4) throws SameCoordinateException, DistanceException {
        super(point1, point2, point3, point4);

        double length1 = point1.getDistance(point2);
        double length2 = point2.getDistance(point3);
        double length3 = point3.getDistance(point4);
        double length4 = point4.getDistance(point1);
        if (length1 != length2 || length1 != length3 || length1 != length4) {
            throw new DistanceException("Invalid square: not all sides have equal lengths");
        }

    }

    /**
     * Calculate the perimeter of the square.
     * @return The perimeter of the square.
     */
    @Override
    public double getPerimeter() {
        double lentgh = points.get(0).getDistance(points.get(1));
        return lentgh * 4;
    }

    /**
     * Calculate the area of the square.
     * @return The area of the square.
     */
    @Override
    public double getArea() {
        double lentgh = points.get(0).getDistance(points.get(1));
        return (lentgh * lentgh);
    }
}
