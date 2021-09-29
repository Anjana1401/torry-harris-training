package com.torryharris.driver;


import com.torryharris.exception.BalanceCL;
import com.torryharris.exception.RequestCL;
import com.torryharris.model.Employee;
import com.torryharris.model.HRDept;
public class CompanyDemo {

    public static void main(String[] args) {
        Employee ram = new Employee(5962, "Ram", "Trainee", 30000);
        HRDept hr=new HRDept();
        try {
            hr.noOfDays(ram,2);
            hr.noOfDays(ram,2);
            hr.noOfDays(ram,3);
            hr.noOfDays(ram,3);
            hr.noOfDays(ram,3);


        } catch (RequestCL|BalanceCL ex) {
            System.out.println(ex);
        }
    }
}