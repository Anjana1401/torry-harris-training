package com.torryharris.model;

public class Employee implements Comparable<Employee>{
    private int empid;
    private String name;
    private String des;


    public Employee() {
    }

    @Override
    public int compareTo(Employee o) {
        return this.empid-o.empid;
    }

    public Employee(int empid, String name, String des) {
        this.empid = empid;
        this.name = name;
        this.des = des;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }



}
