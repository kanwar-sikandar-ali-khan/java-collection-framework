package com.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmployeeCallable implements Callable<Integer> {

    private String name;
    private int salary;

    public EmployeeCallable(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Thread running for employee: " + name +
                " | Thread name: " + Thread.currentThread().getName());
        Thread.sleep(500); // simulate processing
        return salary; // return result
    }
}

public class TestCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Create ExecutorService (thread pool)
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit Callable tasks
        Future<Integer> f1 = executor.submit(new EmployeeCallable("Sajid", 5000));
        Future<Integer> f2 = executor.submit(new EmployeeCallable("Hassan", 7000));

        // Retrieve results
        int total = f1.get() + f2.get(); // get() waits until thread finishes (like join)
        System.out.println("Total Salary: " + total);

        // Shutdown executor
        executor.shutdown();
        System.out.println("Main thread finished");
    }
}
