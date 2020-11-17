package com.jasato.pr15;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    protected final AtomicInteger counterOne = new AtomicInteger(0);
    protected final AtomicInteger counterTwo = new AtomicInteger(0);
    protected final AtomicInteger counterThree = new AtomicInteger(0);
    protected final AtomicInteger counterFour = new AtomicInteger(0);
    protected final AtomicInteger counterFive = new AtomicInteger(0);
    protected final AtomicInteger counterSix = new AtomicInteger(0);
    
    public int getCount() {
        return  counterOne.get() + counterTwo.get() + counterThree.get() + counterFour.get() + counterFive.get() + counterSix.get();
    }

    public void getData() {

        System.out.printf(
                "Número 1: %d\n" +
                "Número 2: %d\n" +
                "Número 3: %d\n" +
                "Número 4: %d\n" +
                "Número 5: %d\n" +
                "Número 6: %d\n" +
                "Total: %d\n", counterOne.get(), counterTwo.get(), counterThree.get(), counterFour.get(), counterFive.get(), counterSix.get(), getCount());
    }

}
