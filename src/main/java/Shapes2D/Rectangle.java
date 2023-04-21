package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Rectangle class. A class to create a rectangle and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Rectangle extends Polygon {

    /**
     * Constructor for creating a rectangle.
     * @param point1 Shapes2D.Point of the rectangle.
     * @param point2 Shapes2D.Point of the rectangle.
     * @param point3 Shapes2D.Point of the rectangle.
     * @param point4 Shapes2D.Point of the rectangle.
     */
    public Rectangle(Point point1, Point point2, Point point3, Point point4) throws SameCoordinateException, DistanceException {
        super(point1,point2,point3,point4);

        if(point1.getDistance(point2) == 0 || point2.getDistance(point3) == 0
                || point3.getDistance(point1) == 0 || point3.getDistance(point4) == 0) {

            throw new SameCoordinateException("Invalid rectangle: cannot have 2 points with same coordinate");
        }

        double distance1 = point1.getDistance(point2);
        double distance2 = point2.getDistance(point3);
        double distance3 = point3.getDistance(point4);
        double distance4 = point4.getDistance(point1);
        if((distance3 != distance1 || distance3 != distance2)
                || (distance4 != distance1 || distance4 != distance2)){

            throw new DistanceException("Invalid rectangle: cannot have more than 2 different distances");
        }

    }

    /**
     * Calculate the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        double lentgh = points.get(0).getDistance(points.get(1));
        double witdh = points.get(1).getDistance(points.get(2));

        return (lentgh + witdh) * 2;
    }

    /**
     * Calculate the area of the rectangle.
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        double lentgh = points.get(0).getDistance(points.get(1));
        double witdh = points.get(1).getDistance(points.get(2));

        return (lentgh * witdh);
    }
}
