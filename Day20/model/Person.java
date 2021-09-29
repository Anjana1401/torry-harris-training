package com.torryharris.model;

import com.torryharris.exception.InsufficientFundsException;
import com.torryharris.exception.WithdrawLimitExceededException;

public class Person{
    private String name;
    private int accountNumber;
    private int balance;
    private int totalAccountWithdrawn;
    private final int DAILY_WITHDRAWAL_LIMIT=40000;

    public Person(String name, int accountNumber, int balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccountWithdrawn=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalAccountWithdrawn() {
        return totalAccountWithdrawn;
    }

    public void setTotalAccountWithdrawn(int totalAccountWithdrawn) {
        this.totalAccountWithdrawn = totalAccountWithdrawn;
    }

    public void withdrawnAmount(int amount) throws WithdrawLimitExceededException, InsufficientFundsException {
        if(amount>balance){
            System.out.println("Insufficient Funds!!");
            return;
        }
        if(totalAccountWithdrawn+amount>DAILY_WITHDRAWAL_LIMIT){
            throw new WithdrawLimitExceededException("withdrawal limit exceeded:\n"+totalAccountWithdrawn+"today is Rs." +amount);
        }
        if(amount>balance) {
            throw new InsufficientFundsException("daily limit has exceeded " + DAILY_WITHDRAWAL_LIMIT);
        }
        balance-=amount;
        totalAccountWithdrawn+=amount;
        System.out.println("amount withdrawal for Rs. "+amount+" is success");
        System.out.println("Balance is: "+balance);
        System.out.println("total amount withdrawal for today is: Rs."+totalAccountWithdrawn);
    }
}
