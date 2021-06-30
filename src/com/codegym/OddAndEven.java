package com.codegym;

public class OddAndEven implements Runnable {
    private Thread myThread;
    private String threadName;

    public OddAndEven(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

    public void start() {
        System.out.println("start " + myThread);
        if (myThread == null) {
            myThread = new Thread(this, threadName);
            myThread.start();
        }
    }
}
