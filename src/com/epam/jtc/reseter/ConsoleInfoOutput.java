package com.epam.jtc.reseter;

public class ConsoleInfoOutput implements InfoOutput {

    @Override
    public void outputArray(NumericOneDimArray array, String... extraInfo) {
        for (String str : extraInfo) {
            System.out.println(str);
        }
        System.out.println(array);
    }

    @Override
    public void outputStrings(String... stringsForOutput) {
        for (String string : stringsForOutput)
            System.out.println(string);
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
            outputStrings(array.resetArrayPositiveElementsIfAverageInIntervalMoreThanAmount(lowIntervalLimit,
                    highIntervalLimit).toString(), "Array after transformation: ");
        }
    }
}
