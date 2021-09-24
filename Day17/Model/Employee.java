package com.torryharris.model;

public class Employee {
    private String name;
    private int employeeId;
    private String destination;
    private float salary;

    public Employee() {
    }

    public Employee(String name, int employeeId, String destination, float salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.destination = destination;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", destination='" + destination + '\'' +
                ", salary=" + salary +
                '}';
    }
}
