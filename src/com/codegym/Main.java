package com.codegym;

public class Main {

    public static void main(String[] args) {
        OddThread oddThread = new OddThread("thread1");
        oddThread.start();
        EvenThread evenThread = new EvenThread("thread2");
        evenThread.start();
    }
}
