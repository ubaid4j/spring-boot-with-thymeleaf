package com.ts.employeeDirectory.exception;

/**
 * throws when user not found
 *
 * @author ubaid
 */
public class UserNotFoundException extends AppRuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}