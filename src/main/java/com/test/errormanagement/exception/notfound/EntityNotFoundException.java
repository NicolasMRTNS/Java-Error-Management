package com.test.errormanagement.exception.notfound;

import com.test.errormanagement.constant.ExceptionMessageConstant;

public class EntityNotFoundException extends CustomNotFoundException {
    public EntityNotFoundException(String entityType, String id) {
        super(ExceptionMessageConstant.USER_NOT_FOUND, entityType, id);
    }
}
