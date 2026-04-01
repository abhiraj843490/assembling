package com.assembling.Threads;

import java.util.concurrent.locks.ReentrantLock;
public class Wallet {
    private int balance = 100;
    private ReentrantLock lock = new ReentrantLock();
    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName()+" processing...");
                balance = balance - amount;
            }
        } finally {
            lock.unlock();
        }
    }
    public int getBalance() {
        return balance;
    }
}
