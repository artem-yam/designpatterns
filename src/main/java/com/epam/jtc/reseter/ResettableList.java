package com.epam.jtc.reseter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ResettableList implements ResettableCollection {

    private List<Double> elements;
    private double lowLimit;
    private double highLimit;

    ResettableList(double lowLimit, double highLimit,
                   List<Double> list) {
        this.elements = list;
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
    }

    @Override
    public Collection<Double> getElements() {
        return elements;
    }

    @Override
    public double getLowLimit() {
        return lowLimit;
    }

    @Override
    public double getHighLimit() {
        return highLimit;
    }

    @Override
    public ResettableCollection resetPositiveElements() {
        ResettableCollection resettableCollection;

        if (isNeedToReset()) {

            List<Double> newList = new ArrayList<>();

            for (Double element : elements) {
                if (element > 0) {
                    newList.add(0.0);
                } else {

                    newList.add(element);
                }
            }

            resettableCollection = new ResettableList(lowLimit, highLimit,
                    newList);

        } else {
            resettableCollection = clone();
        }

        return resettableCollection;
    }

    @Override
    public ResettableList clone() {
        List<Double> result = new ArrayList<>();

        for (Double element : elements) {
            result.add(element.doubleValue());
        }

        return new ResettableList(lowLimit, highLimit, result);
    }

    @Override
    public boolean isNeedToReset() {
        List<Double> elementsInInterval =
                getElementsInInterval();

        int elementsAmount = elementsInInterval.size();
        Double elementsSum = getElementsSum(elementsInInterval);

        return (elementsAmount != 0) &&
                (elementsSum / elementsAmount > elementsAmount);
    }

    private List<Double> getElementsInInterval() {
        List<Double> elementsInInterval = new ArrayList<>();

        for (Double element : elements) {

            if ((element >= lowLimit) &&
                    (element <= highLimit)) {
                elementsInInterval.add(element);
            }
        }

        return elementsInInterval;
    }

    private Double getElementsSum(List<Double> elements) {
        double sum = 0;
        for (Double element : elements) {
            sum += element;
        }

        return sum;
    }

}
