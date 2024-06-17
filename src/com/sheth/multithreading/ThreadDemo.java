package com.sheth.multithreading;

public class ThreadDemo extends Thread {

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

        ThreadDemo td = new ThreadDemo();
        td.start();
    }
}
