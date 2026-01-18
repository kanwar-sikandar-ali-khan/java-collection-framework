package com.test;

import java.util.concurrent.*;

// 1️⃣ Extend Thread
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread running (Thread class): " + getName());
    }
}

// 2️⃣ Implement Runnable
class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running (Runnable): " + name);
    }
}

// 3️⃣ Implement Callable
class MyCallable implements Callable<String> {
    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(500);
        return "Thread result (Callable): " + name;
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Main thread started");

        // 1️⃣ Using Thread class
        MyThread t1 = new MyThread("Thread-1");
        t1.start();

        // 2️⃣ Using Runnable
        Thread t2 = new Thread(new MyRunnable("Runnable-1"));
        t2.start();

        // wait for t1 and t2
        t1.join();
        t2.join();

        // 3️⃣ Using Callable + ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> f1 = executor.submit(new MyCallable("Callable-1"));
        Future<String> f2 = executor.submit(new MyCallable("Callable-2"));

        System.out.println(f1.get());
        System.out.println(f2.get());

        // 4️⃣ Using ExecutorService directly with Runnable
        executor.submit(() -> System.out.println("Runnable task submitted to ExecutorService"));

        executor.shutdown(); // shutdown after tasks finish
        System.out.println("Main thread finished");
    }
}
