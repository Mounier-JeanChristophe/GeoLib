package Shapes3D;
/**
 * Shape interface. Gives methods signature for any 3D shape.
 * @author Kilian QUITTARD
 */
public interface IShape {

    /**
     * Calculate the perimeter for every shape.
     * @return The perimeter of the shape.
     */
    public double getPerimeter();

    /**
     * Calculate the area for every shape.
     * @return The area of the shape.
     */
    public double getArea();

    /**
     * Calculate the volume for every shape.
     * @return The volume of the shape.
     */
    public double getVolume();

}
