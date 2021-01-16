package com.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Reuse lambda expressions
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

    Predicate<Employee> salesExecutives = 
      p -> p.getRole().equals(Role.EXECUTIVE) 
        && p.getDept().equals("Sales");
    
    Predicate<Employee> salesEmployeesOver50 = 
      p -> p.getAge() >= 50 && p.getDept().equals("Sales");
    

      System.out.println("\n==== RoboMail 01");
      System.out.println("\n===  Sales Execs ===");
      pl.stream()
        .filter(e->e.getRole() == Role.EXECUTIVE)
        .filter(e->e.getDept().equals("Sales"))
        .forEach(e-> robo.roboMail(e));

      pl.stream()
        .filter(e->e.getRole() == Role.EXECUTIVE)
        .filter(e->e.getDept().equals("Sales"))
        .forEach(e-> robo.roboText(e));

      System.out.println("\n\n=== All Sales ===");
        pl.stream()
        .filter(e->e.getDept().equals("Sales"))
        .filter(e->e.getAge() > 50)
        .forEach(e-> robo.roboMail(e));

        pl.stream()
        .filter(e->e.getDept().equals("Sales"))
        .filter(e->e.getAge() > 50)
        .forEach(e-> robo.roboText(e));
  
   /* pl.stream()
      .filter(e->e.getAge() < 65)
      .filter(e->e.getDept().equals("Eng"))
      .filter(e->e.getGender() == Gender.MALE)
      .forEach(e-> robo.roboMail(e));

      System.out.println("\n=== Sales Execs ===");
      pl.stream()
      .filter(e->e.getAge() < 65)
      .filter(e->e.getDept().equals("Eng"))
      .filter(e->e.getGender() == Gender.MALE)
      .forEach(e -> robo.roboText(e));
*/
        
     
    
 //   robo.mail(pl, salesExecutives); // Convert to stream and forEach
 //   robo.text(pl, salesExecutives); // Convert to stream and forEach
    
  //  System.out.println("\n=== All Sales ===");
  //  robo.mail(pl, salesEmployeesOver50); // Convert to stream and forEach
  //  robo.text(pl, salesEmployeesOver50); // Convert to stream and forEach   
  }
}
