package Shapes2D;

/**
 * Point class. A class to create a point and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Point {

    /**
     * Value on x-axis.
     */
    private double x;

    /**
     * Value on y-axis.
     */
    private double y;

    /**
     * Radius of the circle
     * @param x Value on x-axis.
     * @param y Value on y-axis.
     */
    public Point(double x, double y){
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
     * @param point The second point for calculating the distance.
     * @return The distance between the two points.
     */
    public double getDistance(Point point){
        return Math.sqrt(Math.pow(point.getY()-y,2) + Math.pow(point.getX()-x,2));
    }

}
