package com.abhi_prep.practice;

public class ThreadLocalExm {
    public static void main(String[]args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();

        //Waits for this thread to terminate
        thread1.join();
        thread2.join();
    }
}

class MyRunnable implements Runnable{
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
    @Override
    public void run(){
        threadLocal.set((int) (Math.random() * 100D));
        try{
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadLocal.get());
    }
}