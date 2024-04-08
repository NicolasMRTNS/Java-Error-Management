package com.test.errormanagement.exception;

/**
 * This is the top class of our exception handling. It extends RuntimeException as every exception in Spring Boot
 * is ultimately a RuntimeException.
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, String param1) {
        super(String.format(message, param1));
    }

    public CustomException(String message, String param1, String param2) {
        super(String.format(message, param1, param2));
    }

    public CustomException(String message, String param1, String param2, String param3) {
        super(String.format(message, param1, param2, param3));
    }
}
