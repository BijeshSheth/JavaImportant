package com.sheth.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {


        // #1
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello, I m Virtual Thread");
        });
        //LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(10)); // Wait for some time and
        Thread.sleep(100);

        // #2
        Thread thread1 = Thread.ofVirtual(). start(() -> {
            System.out.println("Hello, I m Virtual Thread1");
        });
        thread1.join();

        // #3
        Thread.Builder builder = Thread.ofVirtual().name("Builder_Virtual_Thread");

        Runnable run = () -> {
            System.out.println("Builder Virtual Thread");
        };

        Thread t = builder.start(run);
        Thread.sleep(100);
        t.join();



    }
}
