package com.epam.jtc.reseter;

public interface NumericOneDimArray {

    NumericOneDimArray resetArrayPositiveElementsIfAverageInIntervalMoreThanAmount(double lowIntervalLimit, double highIntervalLimit);

    NumericOneDimArrayClass getArrayOfElementsInInterval(double lowIntervalLimit, double highIntervalLimit);

    double getElementsSum();

    double[] getElements();

    int getLength();

}
