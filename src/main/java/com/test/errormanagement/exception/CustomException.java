package com.test.errormanagement.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

/**
 * This is the top class of our exception handling. It extends RuntimeException as every exception in Spring Boot
 * is ultimately a RuntimeException.
 */
@Getter
@Setter
public abstract class CustomException extends RuntimeException {
    private HttpStatus httpStatus;
    private String message;
}
