package Shapes3D;

import Vectors.Vector3;

public class Cylinder implements IShape {

    /**
     * First vector of the cylinder.
     */
    Vector3 vector1;

    /**
     * Second vector of the cylinder.
     */
    Vector3 vector2;

    /**
     * Radius of the cylinder.
     */
    double radius;

    /**
     * Height of the cylinder.
     */
    double height;

    /**
     * Constructor for creating a cylinder.
     * @param vector1 The first vector in the cylinder.
     * @param vector2 The second vector in the cylinder.
     * @param radius The radius of the cylinder.
     */
    public Cylinder(Vector3 vector1, Vector3 vector2, double radius){
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.radius = radius;

        this.height = vector1.getDistance(vector2);
    }

    /**
     * Calculate the perimeter for the cylinder.
     * @return The perimeter of the cylinder.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculate the area for the cylinder.
     * @return The area of the cylinder.
     */
    @Override
    public double getArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    /**
     * Calculate the volume for the cylinder.
     * @return The volume of the cylinder.
     */
    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
