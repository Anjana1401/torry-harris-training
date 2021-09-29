package com.torryharris.driver;

import com.torryharris.exception.InsufficientFundsException;
import com.torryharris.exception.WithdrawLimitExceededException;


import com.torryharris.model.Person;

public class customExceptionDemo {
    public static void main(String[] args) {
        Person ram=new Person("Ram",120001,80000);
        try {
            ram.withdrawnAmount(10000);
            ram.withdrawnAmount(20000);
            ram.withdrawnAmount(1000);
            ram.withdrawnAmount(1);
        }catch(WithdrawLimitExceededException | InsufficientFundsException ex){
            System.err.println(ex);
        }
    }
}
