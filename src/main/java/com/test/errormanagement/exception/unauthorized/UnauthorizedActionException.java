package com.test.errormanagement.exception.unauthorized;

import com.test.errormanagement.constant.ExceptionMessageConstant;

public class UnauthorizedActionException extends CustomUnauthorizedException {
    public UnauthorizedActionException(String action) {
        super(ExceptionMessageConstant.UNAUTHORIZED_ACTION, action);
    }    
}
