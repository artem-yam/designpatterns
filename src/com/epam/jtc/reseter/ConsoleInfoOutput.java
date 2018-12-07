package com.epam.jtc.reseter;

public class ConsoleInfoOutput implements InfoOutput {

    @Override
    public void outputArray(NumericOneDimArray array) {
        System.out.println("----------------------");
        System.out.println("Array : ");
        System.out.println(array);
        System.out.println("----------------------");
    }

    @Override
    public void outputIntervalInfo(NumericOneDimArray array, double lowIntervalLimit,
                                   double highIntervalLimit) {
        NumericOneDimArray arrayInInterval = array.getArrayOfElements(lowIntervalLimit, highIntervalLimit);

        int arrayAmount = arrayInInterval.getLength();

        System.out.println("Amount of element belonging " +
                "to a range from " + lowIntervalLimit + " to "
                + highIntervalLimit + " = " + arrayAmount);

        double arrayAverageValue;

        if (arrayAmount != 0) {
            arrayAverageValue = arrayInInterval.getElementsSum() / arrayInInterval.getLength();

            System.out.println(String.format("Elements average value = %.3f",
                    arrayAverageValue));

            if (arrayAverageValue > arrayAmount) {
                System.out.println("Positive elements need to be reseted");
            }
        }
    }
}
