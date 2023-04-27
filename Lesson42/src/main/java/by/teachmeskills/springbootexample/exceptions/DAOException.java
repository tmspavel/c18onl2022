package by.teachmeskills.springbootexample.exceptions;

public class DAOException extends ServiceException {

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

}
