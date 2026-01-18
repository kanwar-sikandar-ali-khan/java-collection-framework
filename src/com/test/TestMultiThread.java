package com.test;

class Employee extends Thread {

    String name;
    int salary;
    long phoneNumber;

    public Employee(String name, int salary, long phoneNumber) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void run() {
        // Code executed by thread
        System.out.println(
                "Thread running for employee: " + name +
                        " | Thread name: " + Thread.currentThread().getName()
        );
    }
}

public class TestMultiThread {

    public static void main(String[] args) throws InterruptedException {

        Employee emp1 = new Employee("Sajid", 45000, 233254454L);
        Employee emp2 = new Employee("Hassan", 55000, 987654321L);

        // Start threads (VERY IMPORTANT)
        emp1.start();
        emp2.start();

        emp1.join();
        emp2.join();

        System.out.println("Main thread finished");
    }
}

