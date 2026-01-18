package com.test;

class EmployeeTask implements Runnable {

    private String name;
    private int salary;
    private static int totalSalary = 0; // shared resource

    public EmployeeTask(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // synchronized method to safely update shared resource
    private synchronized void addSalary() {
        totalSalary += salary;
        System.out.println("Added salary by " + name + ", Total: " + totalSalary);
    }

    public static int getTotalSalary() {
        return totalSalary;
    }

    @Override
    public void run() {
        System.out.println("Thread started: " + name + " | Thread name: " + Thread.currentThread().getName());
        try {
            Thread.sleep(500); // simulate work, Timed Waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addSalary(); // synchronized
        System.out.println("Thread finished: " + name);
    }
}

public class TestAllThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new EmployeeTask("Sajid", 5000));
        Thread t2 = new Thread(new EmployeeTask("Hassan", 7000));

        // Set thread names
        t1.setName("Employee-1");
        t2.setName("Employee-2");

        // Set thread priorities (optional)
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // Check initial state
        System.out.println("t1 is alive? " + t1.isAlive()); // false, New state

        // Start threads (Runnable -> Running)
        t1.start();
        t2.start();

        // Main thread waits for threads to finish (join)
        t1.join();
        t2.join();

        System.out.println("Both threads finished. Total salary: " + EmployeeTask.getTotalSalary());
        System.out.println("Main thread finished");
    }
}
