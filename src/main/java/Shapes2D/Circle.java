
package Shapes2D;

import Shapes2D.Exceptions.NegativeRadiusException;
import Vectors.Vector2;

/**
 * Circle class. A class to create a circle and process calculations on it.
 * @author Kilian QUITTARD, JC MOUNIER
 */

public class Circle {

    /**
     * Center point of the circle.
     */
    private Vector2 centerPoint;

    /**
     * Radius of the circle.
     */
    private double radius;

    /**
     * Constructor for creating a circle.
     * @param centerPoint Center point of the circle.
     * @param radius Radius point of the circle.
     */
    public Circle(Vector2 centerPoint, double radius) throws NegativeRadiusException {
        if(radius < 0){
            throw new NegativeRadiusException("Cannot have a negative radius.");
        }
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    /**
     * Calculate the perimeter of the circle.
     * @return The perimeter of the circle.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculate the area of the circle.
     * @return The area of the circle.
     */
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    /**
     * Calculate the diameter of the circle
     * @return The diameter of the circle
     */
    public double getDiameter(){return radius * 2;}
}