package com.example;

public class Main {

    public static void main(String[] args){

       IntegerStack intStack = new IntegerStack();

       for (int i=0; i<10; i++){
           intStack.push(i);
       }
       
       System.out.println("After pushing 10 numbers: " + intStack);

       int number = intStack.pop();
       System.out.println("Popped number = " + number);
       System.out.println("After popping 1 number: " + intStack);

       int top = intStack.peek();
       System.out.println("Peeked element = " + top);
       System.out.println("After peeking 1 number: " + intStack); 
        
    }
    
}
