package com.sheth.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) {

        Runnable run = () -> {
            for (int i = 1; i <= 10000; i++) {
                atomicInteger.incrementAndGet();
            }
        };

        Thread t1= new Thread(run);
        Thread t2= new Thread(run);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
            System.out.println(STR."Counter : \{atomicInteger.get()}");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
