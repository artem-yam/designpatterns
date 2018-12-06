package com.epam.jtc.reseter;

public class ConsoleInfoOutput implements InfoOutput {

    @Override
    public void outputArray(NumericOneDimArray array, String extraInfo) {
        System.out.println("-----------------------------------");
        System.out.println(extraInfo);
        System.out.println(array);
        System.out.println("-----------------------------------");
    }

    @Override
    public void outputString(String stringForOutput) {
        System.out.println(stringForOutput);
    }


    @Override
    public void outputArrayInfoAfterIntervalCheck(NumericOneDimArray array, double lowIntervalLimit,
                                                  double highIntervalLimit) {
        NumericOneDimArray arr = array.getArrayOfElementsInInterval(lowIntervalLimit, highIntervalLimit);

        System.out.println("Amount of element belonging " +
                "to a range from " + lowIntervalLimit + " to "
                + highIntervalLimit + " = " + arr.getLength());


        if (arr.getLength() != 0) {
            System.out.println(String.format("Elements average value = %.3f",
                    arr.getElementsSum() / arr.getLength()));
            outputArray(array.resetArrayPositiveElementsIfAverageInIntervalMoreThanAmount(lowIntervalLimit,
                    highIntervalLimit), "Array after transformation: ");
        }
    }
}
