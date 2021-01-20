package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

  public static void main(String[] args) {
    // Setup Executor
    ExecutorService es = Executors.newCachedThreadPool();

    CountRunnable a = new CountRunnable(20, "A");
    CountRunnable b = new CountRunnable(20, "B");
    CountRunnable c = new CountRunnable(20, "C");
    
    // Submit Runnable
    es.submit(a);
    es.submit(b);
    es.submit(c);
    
    // Showndown ExectuorService
    es.shutdown();

  }
}
