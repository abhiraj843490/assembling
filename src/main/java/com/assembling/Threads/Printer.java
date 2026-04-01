package com.assembling.Threads;

class Test {
    public static synchronized void print() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Printer {
    public static void main(String[] args) {
        Test p1 = new Test();
        Test p2 = new Test();

        Thread t1 = new Thread(() -> p1.print(), "T1");
        Thread t2 = new Thread(() -> p1.print(), "T2");
        Thread t3 = new Thread(() -> p2.print(), "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}


