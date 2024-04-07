package com.test.errormanagement.exception.notfoundexception;

public class UserNotFoundException extends CustomNotFoundException {
    UserNotFoundException() {
        super("User Not Found in the DB.");
    }
}
