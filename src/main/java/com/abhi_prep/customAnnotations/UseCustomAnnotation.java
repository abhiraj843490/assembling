package com.abhi_prep.customAnnotations;

import org.springframework.stereotype.Service;

@Service
public class UseCustomAnnotation {
    @EnableLogs
    public void service() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("server is running....");
    }
}
