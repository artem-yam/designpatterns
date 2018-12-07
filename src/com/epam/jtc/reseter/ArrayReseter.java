package com.epam.jtc.reseter;

/**
 * Подсчитать количество элементов, значения которых лежат в диапазоне от
 * lowLimit до highLimit. Если среднее арифметическое значений элементов, которые
 * лежат в этом диапазоне, превышает количество таких элементов, то обнулить
 * элементы с положительными значениями.
 */
public class ArrayReseter {

    private InfoOutput infoOutput = new ConsoleInfoOutput();

    public static void main(String[] args) {

        ArrayReseter reseter = new ArrayReseter();

        reseter.handleArray(new NumericOneDimArrayClass(-50, 0, 3, 1, -8, 10, 25), 1, 12);
    }


    private void handleArray(NumericOneDimArray arrayObject, double lowLimit, double highLimit) {

        // infoOutput.outputArray(arrayObject, "Origin Array:");
        infoOutput.outputArray(arrayObject, "Origin array: ");

        infoOutput.outputStrings("Interval: [" + lowLimit + " ; " + highLimit + "] ");

        NumericOneDimArray resetedArray = arrayObject.
                resetArrayPositiveElementsIfAverageInIntervalMoreThanAmount(lowLimit, highLimit);

        infoOutput.outputArray(resetedArray, "Array after transformation: ");

        //infoOutput.outputArrayInfoAfterIntervalCheck(arrayObject, lowLimit, highLimit);
    }

}
