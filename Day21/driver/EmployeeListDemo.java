package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeListDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(5962, "Anjana", "Trainee");
        Employee e2 = new Employee(5961, "Ashwin", "Trainee");
        Employee e3 = new Employee(5963, "Sanjana", "Trainee");
        Employee e4 = new Employee(5964, "Muktha", "Trainee");
        Employee e5 = new Employee(5965, "Chandra", "Trainee");

        ArrayList<Employee> empList = new ArrayList<>();
        if (empList.isEmpty()) {
            System.out.println("Employee List is emplty");
        }
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        System.out.println("********Before Sorting*******");
        Iterator<Employee> employeeIterator = empList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
        empList.sort(null);
        System.out.println("*******After Sorting******");

         employeeIterator = empList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());
        }
    }
}
