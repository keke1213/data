package com.practice.TestThread.pool;

import java.util.concurrent.*;

public class test02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadFactory factory=r -> new Thread(r, "test-thread-pool");
//        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
//                new SynchronousQueue<>(), factory, new ThreadPoolExecutor.DiscardOldestPolicy());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });

        System.out.println("future.get() = " + future.get());


    }
}
