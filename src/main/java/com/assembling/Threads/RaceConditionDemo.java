package com.assembling.Threads;

class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter::increment);
        Thread t2 = new Thread(counter::increment);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: " + counter.count); // Not always 2
    }
}

