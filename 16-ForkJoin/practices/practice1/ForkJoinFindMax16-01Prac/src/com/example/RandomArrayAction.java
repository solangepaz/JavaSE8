package com.example;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayAction extends RecursiveAction {

    private static final long serialVersionUID = 1L;
    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end; 

    RandomArrayAction(int[] myArray, int start, int end, int threshold) {
        this.threshold = threshold;
        this.myArray = myArray;
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (end - start < threshold) {
            for (int i = start; i <= end; i++) {
            myArray[i] = ThreadLocalRandom.current().nextInt();
            } 
        }
        else {
            int midway = (end - start) / 2 + start;
            RandomArrayAction a1 = new RandomArrayAction(myArray, start, midway, threshold);
            a1.fork();
            RandomArrayAction a2 = new RandomArrayAction(myArray, midway + 1, end, threshold);
            a2.compute();
            a1.join();
        }
     }     
}
