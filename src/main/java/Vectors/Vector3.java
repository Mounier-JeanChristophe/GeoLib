package Vectors;

/**
 * Vector3 class. A class to create a point and process calculations on it.
 * @author Kilian QUITTARD
 * @author Gregory EYRAUD
 */

public class Vector3 extends Vector2 {

    /**
     * Value on z-axis.
     */
    private final double z;

    /**
     * Constructor for creating a Vector2D
     * @param x Value on x-axis.
     * @param y Value on y-axis.
     * @param z Value on z-axis.
     */
    public Vector3(double x, double y,double z){
        super(x,y);
        this.z = z;
    }

    /**
     * Getter for the y member variable.
     * @return The z-axis of the point.
     */
    public double getZ() {
        return z;
    }

    /**
     * Calculate the distance between this point and another.
     * @param vector The second vector for calculating the distance.
     * @return The distance between the two points.
     */
     public double getDistance(Vector3 vector){
        return Math.sqrt(Math.pow(vector.getY()-y,2) + Math.pow(vector.getX()-x,2) + Math.pow(vector.getZ()-z,2));
     }

}
