package Shapes2D;

import Shapes2D.Exceptions.SameCoordinateException;
import Vectors.Vector2;

/**
 * Triangle class. A class to create a triangle and process calculations on it.
 * @author Kilian QUITTARD
 */


public class Triangle extends Polygon {

    /**
     * Constructor for creating a triangle.
     * @param vector1 Shapes2D.Vector2 of the triangle.
     * @param vector2 Shapes2D.Vector2 of the triangle.
     * @param vector3 Shapes2D.Vector2 of the triangle.
     */
    public Triangle(Vector2 vector1, Vector2 vector2, Vector2 vector3) throws SameCoordinateException {
        super(vector1, vector2, vector3);
        if(vector1.getDistance(vector2) == 0 || vector2.getDistance(vector3) == 0 || vector3.getDistance(vector1) == 0){
            throw new SameCoordinateException("Cannot have 2 points with same coordinate");
        }
    }

    /**
     * Calculate the area of the triangle.
     * @return The area of the triangle.
     */
    @Override
    public double getArea() {
        double base = vectors.get(0).getDistance(vectors.get(1));
        double height = findHeight();
        return (base * height) /2;
    }

    /**
     * Find the height of the triangle.
     * @return The height of the triangle.
     */
    private double findHeight() {
        Vector2 vector21 = vectors.get(0);
        Vector2 vector22 = vectors.get(1);
        Vector2 vector23 = vectors.get(2);

        double a = vector22.getY() - vector21.getY();
        double b = vector21.getX() - vector22.getX();
        double c = -a * vector21.getX() - b * vector21.getY();
        return Math.abs((a * vector23.getX() + b * vector23.getY() + c) / Math.sqrt(a * a + b * b));
    }
}
