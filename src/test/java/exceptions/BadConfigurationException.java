package exceptions;

public class BadConfigurationException extends RuntimeException {

    public BadConfigurationException(String message) {
        super(message);
    }

    public BadConfigurationException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
