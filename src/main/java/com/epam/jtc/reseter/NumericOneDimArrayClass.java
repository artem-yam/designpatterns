package com.epam.jtc.reseter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumericOneDimArrayClass implements NumericOneDimArray {

    private double[] dimArray;

    public NumericOneDimArrayClass(double... args) {
        this.dimArray = args;
    }

    @Override
    public int getLength() {
        return this.dimArray.length;
    }

    @Override
    public NumericOneDimArray changeArrayDependingOnIntervalElements(double lowIntervalLimit, double highIntervalLimit) {
        NumericOneDimArray arrayOfElementsInInterval = getArrayOfElements(lowIntervalLimit, highIntervalLimit);

        if (isNeedToReset(arrayOfElementsInInterval)) {
            return getArrayWithNoPositiveElements();
        }

        return this;
    }

    private boolean isNeedToReset(NumericOneDimArray elementsInInterval) {
        int elementsAmount = elementsInInterval.getLength();
        double elementsSum = elementsInInterval.getElementsSum();

        if ((elementsAmount != 0) && (elementsSum / elementsAmount > elementsAmount)) {
            return true;
        }

        return false;
    }

    @Override
    public NumericOneDimArrayClass getArrayOfElements(double lowIntervalLimit, double highIntervalLimit) {
        List<Double> elementsInInterval = new ArrayList<>();

        for (int i = 0; i < this.dimArray.length; i++) {

            if ((dimArray[i] >= lowIntervalLimit) && (dimArray[i] <= highIntervalLimit)) {
                elementsInInterval.add(dimArray[i]);

            }
        }

        return new NumericOneDimArrayClass(elementsInInterval.stream().mapToDouble(Double::doubleValue).toArray());
    }

    private NumericOneDimArrayClass getArrayWithNoPositiveElements() {
        double[] newArray = dimArray.clone();

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > 0) {
                newArray[i] = 0;
            }
        }
        return new NumericOneDimArrayClass(newArray);
    }

    @Override
    public double getElementsSum() {
        double sum = 0;
        for (int i = 0; i < this.dimArray.length; i++) {
            sum += this.dimArray[i];
        }

        return sum;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.dimArray);
    }

}
