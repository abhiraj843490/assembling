package com.abhi_prep.practice;

import java.util.concurrent.CompletableFuture;
/*
     it is allow you write asynchronous and non-blocking programing,
     it allow you to create multiple combination of asynchronous task
     represent the result that is available in the future
     various non-blocking methods to retrive the result: thenApply(), thenAccept(), or join()
     completablefuture provide methods :
        thenCompose(), thenCombine(), and allOf() to compose multiple asynchronous operation.
      we can catch the exception   : exceptionally() and handle().
 */

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result from CompletableFuture";
        });

        future.thenAccept(result -> System.out.println(result));
        future.join();
    }
}

