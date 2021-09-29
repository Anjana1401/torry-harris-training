package com.torryharris.model;

import com.torryharris.exception.BalanceCL;
import com.torryharris.exception.RequestCL;

public class Employee {
    private int eid;
    private String name;
    private String destination;
    private int salary;
    private int balance;

    public Employee(int eid, String name, String destination, int salary) {
        this.eid = eid;
        this.name = name;
        this.destination = destination;
        this.salary = salary;
        balance=12;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
