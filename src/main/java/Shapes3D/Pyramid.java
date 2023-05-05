package Shapes3D;

import Shapes2D.Square;
import Vectors.Vector2;
import Vectors.Vector3;

/**
 * Rectangle class. A class to create a pyramid and process calculations on it.
 * @author Kilian QUITTARD
 */


public class Pyramid implements IShape {

    /**
     * Base square of the pyramid.
     */
    private Square base;

    /**
     * Height of the pyramid.
     */
    private double height;

    /**
     * Constructor for creating a cylinder.
     * @param base The base of the pyramid.
     * */
    public Pyramid(Square base){
        this.base = base;
        this.height = findHeight();
    }

    /**
     * Constructor for creating a cylinder.
     * @param base The base of the pyramid.
     * @param apex The vector of the pyramid.
     */
    public Pyramid(Square base, Vector3 apex){
        this.base = base;
        this.height = findHeight(apex);
    }

    /**
     * Calculate the height for the pyramid.
     * @return The height of the pyramid.
     */
    public double findHeight() {
        double baseSideLength = base.getVectors().get(0).getDistance(base.getVectors().get(1));
        double baseDiagonal = baseSideLength * Math.sqrt(2);
        double apexDiagonal = baseDiagonal / 2;
        return Math.sqrt(apexDiagonal * apexDiagonal - (baseDiagonal / 2) * (baseDiagonal / 2));
    }

    /**
     * Calculate the height for the pyramid from the apex position.
     * @return The height of the pyramid.
     */
    public double findHeight(Vector3 apex) {
        return apex.getDistance(base.getCenter());
    }

    /**
     * Calculate the perimeter for the pyramid.
     * @return The perimeter of the pyramid.
     */
    @Override
    public double getPerimeter() {
        return base.getPerimeter();
    }


    /**
     * Calculate the area for the pyramid.
     * @return The area of the pyramid.
     */
    @Override
    public double getArea() {
        double baseArea = base.getArea();
        double lateralArea = (base.getPerimeter() * height) / 2.0;
        return baseArea + lateralArea;
    }

    /**
     * Calculate the volume for the pyramid.
     * @return The volume of the pyramid.
     */
    @Override
    public double getVolume() {
        double baseArea = base.getArea();
        return (baseArea * height) / 3.0;
    }

}
