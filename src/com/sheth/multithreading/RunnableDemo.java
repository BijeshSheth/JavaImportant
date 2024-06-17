package com.sheth.multithreading;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i<=10; i++) {
            System.out.println("Hello :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t1 = new Thread(r);
        t1.start();
    }
}
