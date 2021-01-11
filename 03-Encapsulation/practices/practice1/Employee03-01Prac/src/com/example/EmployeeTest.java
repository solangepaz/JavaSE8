package com.example;

import com.example.domain.Engineer;
import com.example.domain.Manager;
import com.example.domain.Admin;
import com.example.domain.Director;



public class EmployeeTest {

    public static void main(String[] args) {
   
        Engineer eng = new Engineer(101, "Jane Smith", "012-34-5678", 120345.27);
		Manager man = new Manager(207,"Barbara Johnson", "054-12-2367", 109501.36, "US Marketing");
		Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75002.34);
		Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 420567.36, "Global Narketing", 1000000);

        eng.printEmployee();
        man.printEmployee();
        adm.printEmployee();
        dir.printEmployee();
     

       /* System.out.println ("Engineer id:         " + eng.getEmpId());
        System.out.println ("Engineer name:       " + eng.getName());
        System.out.println ("Engineer Soc Sec #:  " + eng.getSsn());
        System.out.println ("Engineer salary:     " + eng.getSalary());
        */

        

       /* System.out.println ("Before raiseSalary: " + adm.getSalary() + " " + adm.getName());
        adm.raiseSalary(10);
        adm.setName("Joao");
        System.out.println ("After  raiseSalary: " + adm.getSalary() + " " + adm.getName());*/

      /*  adm.raiseSalary(-2);
        adm.raiseSalary(2);*/

       /* adm.setName("");
        adm.setName("Ana");*/
    
    }
}