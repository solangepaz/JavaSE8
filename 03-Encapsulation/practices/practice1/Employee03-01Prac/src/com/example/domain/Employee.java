package com.example.domain;

import java.text.NumberFormat;

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public int getEmpId() {
        return this.empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            System.out.println ("Name must be a valid string!"); 
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary (double increase){
        if(increase >= 0)
            this.salary += increase;
        else
            System.out.println ("Increase must be a positive value!"); 
        
    }

    public void printEmployee(){
        System.out.println ("Employee ID: " + getEmpId());
        System.out.println (" name: " + getName());
        System.out.println (" ssn: " + getSsn());
        System.out.println (" salary: " + NumberFormat.getCurrencyInstance().format((double) getSalary()) + "\n");
    }


    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public Employee() {
    }
    
    
    
}

