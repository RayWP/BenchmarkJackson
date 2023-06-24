package com.example.threadplayground;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String args[]) {
        ExecutorService x = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 100000; i++) {
            final int taskId = i;
            x.submit(() -> {
                // Perform the task
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }

    }
}
