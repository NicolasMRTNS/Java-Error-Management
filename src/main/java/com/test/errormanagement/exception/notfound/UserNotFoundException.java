package com.test.errormanagement.exception.notfound;

import com.test.errormanagement.constant.ExceptionMessageConstant;

public class UserNotFoundException extends CustomNotFoundException {
    public UserNotFoundException(String username) {
        super(ExceptionMessageConstant.USER_NOT_FOUND, username);
    }
}
