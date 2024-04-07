package com.test.errormanagement.exception.notfoundexception;

import org.springframework.http.HttpStatus;

import com.test.errormanagement.exception.CustomException;

public class CustomNotFoundException extends CustomException {
    CustomNotFoundException(String message) {
        super.setHttpStatus(HttpStatus.NOT_FOUND);
        super.setMessage(message);
    }
}
