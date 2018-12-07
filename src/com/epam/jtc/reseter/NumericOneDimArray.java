package com.epam.jtc.reseter;

public interface NumericOneDimArray {

    NumericOneDimArray changeArrayDependingOnIntervalElements(double lowIntervalLimit, double highIntervalLimit);

    NumericOneDimArrayClass getArrayOfElements(double lowIntervalLimit, double highIntervalLimit);

    double getElementsSum();

    int getLength();

}
