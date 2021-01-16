package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();    
    
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Sales Execs");
    
    // roboMail Sales Executives
    pl.stream()
      .filter(p->p.getRole()==Role.EXECUTIVE)
      .filter(p->p.getDept()=="Sales").
      forEach(p -> robo.roboMail(p));

  }
}
