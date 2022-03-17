/**
 * Exception class for an invalid booking.
 *
 * @author Shreshta Yadav
 * @version 1.0
 */
public class InvalidBookingException extends Exception {
    /**
     * Constructor for exception with custom message.
     * @param message String representing the message for the exception.
     */
    public InvalidBookingException(String message) {
        super(message);
    }

    /**
     * Constructor with default exception message.
     */
    public InvalidBookingException() {
        super("Invalid booking type");
    }
}
