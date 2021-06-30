package com.codegym;

public class OddThread extends OddAndEven{

    public OddThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(i%2!=0) {
                    System.out.println("printing the count OddThread " + i);
                    Thread.sleep(15);
                }
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
