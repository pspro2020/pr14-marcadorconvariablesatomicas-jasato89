package com.jasato.pr15;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice implements Runnable{

    private Counter counter;
    private final int numTimes;
    Integer result;

    public Dice(Counter counter, int numTimes) {
        this.counter = counter;
        this.numTimes = numTimes;
    }


    @Override
    public void run() {


        for (int i = 0; i < numTimes; i++) {
            result = ThreadLocalRandom.current().nextInt(6) + 1;
            storeResult(result);

        }


    }

    private void storeResult(Integer result) {
        switch (result) {
            case 1:
                counter.counterOne.incrementAndGet();
                break;
            case 2:
                counter.counterTwo.incrementAndGet();
                break;
            case 3:
                counter.counterThree.incrementAndGet();
                break;
            case 4:
                counter.counterFour.incrementAndGet();
                break;
            case 5:
                counter.counterFive.incrementAndGet();
                break;
            case 6:
                counter.counterSix.incrementAndGet();
                break;
        }
    }
}