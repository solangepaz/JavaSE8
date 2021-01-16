package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public void push(Integer number) {
        data.addFirst(number);
    } 

    public Integer pop(){
        if(data.isEmpty())
            System.out.println("Data is empty!");
        return data.removeFirst();
    }

    public Integer peek(){
        return data.peekFirst();
    }

    @Override
    public String toString(){
        return data.toString();
    }

    
}
