package com.example;

public class Employee {

    private String name;
    private String role;
    private String dept;
    private double salary;
    private BenefitsHelper helper = new BenefitsHelper();

    public Employee() {
        super();
        helper = new BenefitsHelper();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
		this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus(){
        return helper.calcBonus();
    }

    public double getWithholding(){
        return helper.calcWithholding();
    }

    private class BenefitsHelper{
        private final double bonusRate = 0.02;
        private final double withholdingRate = 0.07; 

        public double calcBonus(){
            return salary * bonusRate;

        }

        public double  calcWithholding (){
            return salary * withholdingRate;

        }
    }

}


