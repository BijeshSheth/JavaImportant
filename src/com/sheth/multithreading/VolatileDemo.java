package com.sheth.multithreading;



public class VolatileDemo {

    public static volatile boolean flag = false;

    public static void main(String[] args) {

        Thread writterThread = new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag = true;
            System.out.println("Flag set true");
        });

        Thread readerThread = new Thread(() ->{
            while (!flag) {
                Thread.onSpinWait();
                //System.out.println("Busy wait until flag become true");
            }
            System.out.println("Flag is now true");
        });

        writterThread.start();
        readerThread.start();
    }


}
