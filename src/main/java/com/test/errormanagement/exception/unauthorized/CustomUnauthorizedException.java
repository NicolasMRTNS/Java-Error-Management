package com.test.errormanagement.exception.unauthorized;

import com.test.errormanagement.exception.CustomException;

public class CustomUnauthorizedException extends CustomException {
    public CustomUnauthorizedException(String message, String param1) {
        super(message, param1);
    }
}
