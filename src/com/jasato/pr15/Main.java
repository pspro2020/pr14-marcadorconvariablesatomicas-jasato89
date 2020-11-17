package com.jasato.pr15;

public class Main {

    public static void main(String[] args) {

        Thread[] threads = new Thread[3];
        Counter counter = new Counter();

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Dice(counter, 10000));
            threads[i].start();
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        counter.getData();

    }
}
