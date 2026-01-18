package com.test;

class EmployeeTask implements Runnable {
    String name;

    public EmployeeTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running for employee: " + name +
                " | Thread name: " + Thread.currentThread().getName());
    }
}

public class TestRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new EmployeeTask("Sajid"));
        Thread t2 = new Thread(new EmployeeTask("Hassan"));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main thread finished");
    }
}
