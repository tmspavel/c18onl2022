package by.teachmeskills.springbootexample.exceptions;

public class ServiceException extends ControllerException {

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
