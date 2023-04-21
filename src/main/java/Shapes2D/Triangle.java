package Shapes2D;

import Shapes2D.Exceptions.SameCoordinateException;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Triangle class. A class to create a triangle and process calculations on it.
 * @author Kilian QUITTARD
 */


public class Triangle extends Polygon {

    /**
     * Constructor for creating a triangle.
     * @param point1 Shapes2D.Point of the triangle.
     * @param point2 Shapes2D.Point of the triangle.
     * @param point3 Shapes2D.Point of the triangle.
     */
    public Triangle(Point point1, Point point2, Point point3) throws SameCoordinateException {
        super(point1,point2,point3);
        if(point1.getDistance(point2) == 0 || point2.getDistance(point3) == 0 || point3.getDistance(point1) == 0){
            throw new SameCoordinateException("Cannot have 2 points with same coordinate");
        }
    }

    /**
     * Calculate the area of the triangle.
     * @return The area of the triangle.
     */
    @Override
    public double getArea() {
        double base = points.get(0).getDistance(points.get(1));
        double height = findHeight();
        return (base * height) /2;
    }

    /**
     * Find the height of the triangle.
     * @return The height of the triangle.
     */
    private double findHeight() {
        Point point1 = points.get(0);
        Point point2 = points.get(1);
        Point point3 = points.get(2);

        double a = point2.getY() - point1.getY();
        double b = point1.getX() - point2.getX();
        double c = -a * point1.getX() - b * point1.getY();
        return Math.abs((a * point3.getX() + b * point3.getY() + c) / Math.sqrt(a * a + b * b));
    }
}
