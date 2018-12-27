package com.epam.jtc.reseter;

import java.util.Collection;

public interface InfoOutput {

    void showCollection(Collection<Double> elements);

    void showCheckableInterval(Double lowLimit, Double highLimit);

    void showCheckForReset(boolean checkResult);
}
