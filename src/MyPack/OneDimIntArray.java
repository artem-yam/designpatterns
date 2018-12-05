package MyPack;

import java.util.Arrays;

public class OneDimIntArray implements OneDimArray {

    private int[] dimArray;
    private int intervalElementsAmount = 0;
    private double intervalElementsSum = 0;

    public OneDimIntArray(int... args) {
        this.dimArray = args;
    }

    public void setIntervalElementsAmountAndSum(double lowLimit, double highLimit) {
        this.intervalElementsAmount = 0;
        this.intervalElementsSum = 0;

        for (int i = 0; i < this.dimArray.length; i++) {

            checkIntervalForElement(lowLimit, highLimit, this.dimArray[i]);

        }
    }

    @Override
    public int getIntervalElementsAmount() {
        return intervalElementsAmount;
    }

    @Override
    public double getIntervalElementsSum() {
        return intervalElementsSum;
    }

    public void checkArrayForReset(double lowLimit, double highLimit) {
        setIntervalElementsAmountAndSum(lowLimit, highLimit);

        ResetIfAverageValueOverElementsAmount();
    }


    private void checkIntervalForElement(double lowLimit, double highLimit, int element) {
        if ((element >= lowLimit) && (element <= highLimit)) {
            intervalElementsAmount++;
            intervalElementsSum += element;
        }
    }

    private void ResetIfAverageValueOverElementsAmount() {
        if ((intervalElementsAmount != 0) && (intervalElementsSum / intervalElementsAmount > intervalElementsAmount)) {
            zeroPositiveElements();
        }
    }

    private void zeroPositiveElements() {
        for (int i = 0; i < this.dimArray.length; i++) {
            if (this.dimArray[i] > 0) {
                this.dimArray[i] = 0;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.dimArray);
    }

}
