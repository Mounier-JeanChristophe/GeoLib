package Shapes2D.Exceptions;

/**
 * Distance Exception. Generate exception if a rectangle has not correct distances.
 * @author Kilian QUITTARD
 */

public class DistanceException extends Exception {

    /**
     * Constructor for creating the exception.
     * @param message Message of the exception.
     */
    public DistanceException(final String message) {
        super(message);
    }
}
