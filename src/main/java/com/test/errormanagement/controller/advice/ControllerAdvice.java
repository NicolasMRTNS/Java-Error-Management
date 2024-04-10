package com.test.errormanagement.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.test.errormanagement.exception.notfound.CustomNotFoundException;
import com.test.errormanagement.exception.unauthorized.CustomUnauthorizedException;

/**
 * When an exception is thrown, it goes in here and gets handled if they are caught.
 */
@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(value = {CustomNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorEnvelope handleNotFoundException(RuntimeException ex, WebRequest request) {
        final HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        return new ErrorEnvelope(httpStatus.value(), ex.getMessage());
    }

    @ExceptionHandler(value = {CustomUnauthorizedException.class})
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public ErrorEnvelope handleUnauthorizedException(RuntimeException ex, WebRequest request) {
        final HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;
        return new ErrorEnvelope(httpStatus.value(), ex.getMessage());
    }
}
