package MyPack;

import java.util.Arrays;

public class OneDimIntArray implements OneDimArray {

    private int[] dimArray;
    private int intervalElementsAmount = 0;
    private int intervalElementsSum = 0;

    public OneDimIntArray(int... args) {
        this.dimArray = args;
    }

    public int getIntervalElementsAmount(int lowLimit, int highLimit) {
        this.intervalElementsAmount = 0;
        this.intervalElementsSum = 0;

        for (int i = 0; i < this.dimArray.length; i++) {

            checkIntervalForElement(lowLimit, highLimit, this.dimArray[i]);

        }

        isAverageValueOverElementsAmount();

        return intervalElementsAmount;
    }

    private void checkIntervalForElement(int lowLimit, int highLimit, int element) {
        if ((element >= lowLimit) && (element <= highLimit)) {
            intervalElementsAmount++;
            intervalElementsSum += element;
        }
    }

    private void isAverageValueOverElementsAmount() {
        if ((intervalElementsAmount != 0) && (intervalElementsSum / intervalElementsAmount > intervalElementsAmount)) {
            zeroPositiveElements();
        }
    }

    public void zeroPositiveElements() {
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
