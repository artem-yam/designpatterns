package com.epam.jtc.reseter;

import java.util.Collection;

public class ConsoleInfoOutput implements InfoOutput {

    private final static String CHECK_RESET = "Is need to reset: %b\n";
    private final static String ARRAY_ELEMENTS = "Array:\n%s\n";
    private final static String CHECKABLE_INTERVAL = "Interval to check:\n" +
            "[ %s ; %s ]\n";


    @Override
    public void showCollection(Collection<Double> elements) {
        System.out.printf(ARRAY_ELEMENTS, elements);
    }

    @Override
    public void showCheckableInterval(Double lowLimit, Double highLimit) {
        System.out.printf(CHECKABLE_INTERVAL, lowLimit, highLimit);
    }

    @Override
    public void showCheckForReset(boolean checkResult) {
        System.out.printf(CHECK_RESET, checkResult);
    }

}
