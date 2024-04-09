package com.test.errormanagement.exception.notfound;

import com.test.errormanagement.exception.CustomException;

public class CustomNotFoundException extends CustomException {    
    public CustomNotFoundException(String message) {
        super(message);
    }

    public CustomNotFoundException(String message, String param1) {
        super(message, param1);
    }

    public CustomNotFoundException(String message, String param1, String param2) {
        super(message, param1, param2);
    }
}
