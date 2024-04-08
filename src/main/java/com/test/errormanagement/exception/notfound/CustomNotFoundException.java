package com.test.errormanagement.exception.notfound;

import org.springframework.http.HttpStatus;

import com.test.errormanagement.exception.CustomException;

import lombok.Getter;

@Getter
public class CustomNotFoundException extends CustomException {
    private final HttpStatus httpStatus = HttpStatus.NOT_FOUND;
    
    CustomNotFoundException(String message) {
        super(message);
    }

    CustomNotFoundException(String message, String param1) {
        super(message, param1);
    }

    CustomNotFoundException(String message, String param1, String param2) {
        super(message, param1, param2);
    }
}
