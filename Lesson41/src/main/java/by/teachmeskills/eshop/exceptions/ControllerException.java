package by.teachmeskills.eshop.exceptions;

public class ControllerException extends Exception {

    public ControllerException(String message) {
        super(message);
    }

    public ControllerException(String message, Throwable cause) {
        super(message, cause);
    }

}
