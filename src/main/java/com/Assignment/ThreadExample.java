package com.Assignment;

import java.util.concurrent.CountDownLatch;

public class ThreadExample {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(4);

        // Create and start threads T1 to T4
        for (int i = 1; i <= 4; i++) {
            int threadId = i;
            new Thread(() -> {
                try {
                 
                    System.out.println("T" + threadId + " is working.");
                    Thread.sleep(1000); // Simulate work by sleeping
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {

                    latch.countDown();
                }
            }).start();
        }


        new Thread(() -> {
            try {

                latch.await();
                System.out.println("T5 is working after T1, T2, T3, T4 have finished.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }).start();
    }
}

