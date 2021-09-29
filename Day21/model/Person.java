package com.torryharris.model;

public class Person implements Comparable<Person>{
    private Long aadharNumber;
    private String name;
    private String state;
    private String occupation;
    private int salary;

    public Person() {
    }
    @Override
    public int compareTo(Person o) {
        return (this.aadharNumber.compareTo(o.aadharNumber));
    }
    public Person(Long aadharNumber, String name, String state, String occupation,int salary) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
        this.salary=salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "aadharNumber=" + aadharNumber +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

