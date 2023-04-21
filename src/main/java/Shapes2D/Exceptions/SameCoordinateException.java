package Shapes2D.Exceptions;

/**
 * SameCoordinate Exception. Generate exception if at least two points in a shape are the same.
 * @author Kilian QUITTARD
 */

public class SameCoordinateException extends Exception {

    /**
     * Constructor for creating the exception.
     * @param message Message of the exception.
     */
    public SameCoordinateException(final String message) {
        super(message);
    }
}
