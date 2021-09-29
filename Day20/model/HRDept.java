package com.torryharris.model;

import com.torryharris.exception.BalanceCL;
import com.torryharris.exception.RequestCL;

public class HRDept {


    public void noOfDays(Employee emp,int leaves) throws RequestCL,BalanceCL{
        if(leaves>3){
            throw new RequestCL("Invalid request of leaves as no of days is "+leaves);
        }
        else if(leaves> emp.getBalance()){
            throw new BalanceCL("No of leaves exceeded "+leaves);
        }
        else {
            emp.setBalance(emp.getBalance()-leaves);
            System.out.println("No of leaves left" +emp.getBalance() );
            System.out.println("leaves granted");
        }
    }
}
