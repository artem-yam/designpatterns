package com.epam.jtc.reseter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count array elements values in some interval.
 * If average value of such elements more than their amount,
 * set to zero all positive elements in origin array
 */
public class ArrayReseter {

    private static final double LOW_LIMIT = 1.0;
    private static final double HIGH_LIMIT = 12.0;
    private static final List<Double> LIST_TO_CHECK =
            new ArrayList<>(Arrays.asList(3.0, 1.0, -8.0, 20.0, 25.0));


    private InfoOutput infoOutput = new ConsoleInfoOutput();

    public static void main(String[] args) {

        ArrayReseter reseter = new ArrayReseter();

        ResettableCollection listForReset =
                new ResettableList(LOW_LIMIT, HIGH_LIMIT, LIST_TO_CHECK);

        reseter.handleArray(listForReset);
    }


    public void handleArray(ResettableCollection collection) {

        infoOutput.showCollection(collection.getElements());
        infoOutput.showCheckableInterval(collection.getLowLimit(),
                collection.getHighLimit());
        infoOutput.showCheckForReset(collection.isNeedToReset());

        ResettableCollection resetedCollection =
                collection.resetPositiveElements();

        infoOutput.showCollection(resetedCollection.getElements());
    }

}
