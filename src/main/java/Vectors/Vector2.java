package Vectors;

/**
 * Vector2 class. A class to create a point and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Vector2 {

    /**
     * Value on x-axis.
     */
    protected double x;

    /**
     * Value on y-axis.
     */
    protected double y;

    /**
     * Constructor for creating a Vector2D
     * @param x Value on x-axis.
     * @param y Value on y-axis.
     */
    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Getter for the x member variable.
     * @return The x-axis of the point.
     */
    public double getX() {
        return x;
    }

    /**
     * Getter for the y member variable.
     * @return The y-axis of the point.
     */
    public double getY() {
        return y;
    }

    /**
     * Calculate the distance between this point and another.
     * @param vector The second vector for calculating the distance.
     * @return The distance between the two points.
     */
    public double getDistance(Vector2 vector){
        return Math.sqrt(Math.pow(vector.getY()-y,2) + Math.pow(vector.getX()-x,2));
    }

}
