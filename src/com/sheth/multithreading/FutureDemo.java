package com.sheth.multithreading;

import java.util.concurrent.*;

public class FutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<Integer> future = service.submit(new CallableDemo1(10));
        System.out.print(future.get());
    }
}
class CallableDemo1 implements Callable<Integer> {

    int input;
    CallableDemo1(int input)
    {
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum = 0;
        for(int i=1; i<=input; i++){
            sum+=i;
        }
        return sum;
    }
}
