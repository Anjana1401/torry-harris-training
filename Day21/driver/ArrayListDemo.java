package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> iList=new ArrayList<>();
        iList.add("Anjana");
        iList.add("Sanjana");
        iList.add("Muktha");
        iList.sort(null);
        System.out.println(iList);

        ArrayList<Float> fList=new ArrayList<>();
        fList.add(2.9f);
        fList.add(2.8f);
        fList.add(2.6f);
        fList.sort(null);
        System.out.println(fList);

        Employee e1=new Employee(5962,"Anjana","Trainee");
        Employee e2=new Employee(5961,"Ashwin","Trainee");
        Employee e3=new Employee(5963,"Sanjana","Trainee");
        Employee e4=new Employee(5964,"Muktha","Trainee");
        Employee e5=new Employee(5965,"Chandra","Trainee");

        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);


        System.out.println("--------Print Employee List---------");

      /* for(int i=0;i<empList.size();i++)
            System.out.println(empList.get(i));*/
        for(Employee employee: empList)
            System.out.println(employee);
        System.out.println("******using Iterator******");

        Iterator<Employee>  employeeIterator= empList.iterator();
        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next());

        }
        System.out.println("********using object********");
        ArrayList<Object> oList=new ArrayList<>();
        oList.add(1000);
        oList.add("Anjana");
        oList.add(98.286f);
        oList.add(e1);
        System.out.println(oList);



    }

}














