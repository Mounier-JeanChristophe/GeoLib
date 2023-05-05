package Shapes3D;

/**
 * Rectangle class. A class to create a cube and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Cube implements IShape {

    /**
     * Length of a side.
     */
    private double sideLength;

    /**
     * Constructor for creating a cylinder.
     * @param sideLength The side length of the cube.
     */
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Calculate the perimeter for the cube.
     * @return The perimeter of the cube.
     */
    public double getPerimeter() {
        return 12 * sideLength;
    }

    /**
     * Calculate the area for the cube.
     * @return The area of the cube.
     */
    @Override
    public double getArea() {
        return 6 * sideLength * sideLength;
    }

    /**
     * Calculate the volume for the cube.
     * @return The volume of the cube.
     */
    @Override
    public double getVolume() {
        return sideLength * sideLength * sideLength;
    }


}


