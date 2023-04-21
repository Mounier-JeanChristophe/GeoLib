package Shapes2D.Exceptions;

/**
 * Radius Exception. Generate exception if a circle has a negative radius.
 * @author Kilian QUITTARD
 */

public class NegativeRadiusException extends Exception {

    /**
     * Constructor for creating the exception.
     * @param message Message of the exception.
     */
    public NegativeRadiusException(final String message) {
        super(message);
    }
}
