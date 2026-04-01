package com.assembling.Threads;

public class RaceConditionExample {
    public static void main(String[] args) throws Exception {
        Wallet wallet = new Wallet();

        Thread t1 = new Thread(() -> wallet
                .withdraw(80));

        Thread t2 = new Thread(() -> wallet
                .withdraw(80));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + wallet.getBalance());
    }
}