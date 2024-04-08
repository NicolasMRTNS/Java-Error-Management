package com.test.errormanagement.exception.unauthorized;

import org.springframework.http.HttpStatus;

import com.test.errormanagement.exception.CustomException;

import lombok.Getter;

@Getter
public class CustomUnauthorizedException extends CustomException {
    private final HttpStatus httpStatus = HttpStatus.UNAUTHORIZED;
    
    public CustomUnauthorizedException(String message, String param1) {
        super(message, param1);
    }
}
