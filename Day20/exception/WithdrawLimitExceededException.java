package com.torryharris.exception;

import com.torryharris.model.Person;

public class WithdrawLimitExceededException extends Exception {

    public WithdrawLimitExceededException(String message) {
        super(message);
    }
}
