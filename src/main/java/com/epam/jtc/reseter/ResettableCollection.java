package com.epam.jtc.reseter;

import java.util.Collection;

public interface ResettableCollection extends Cloneable {

    ResettableCollection resetPositiveElements();

    boolean isNeedToReset();

    Collection<Double> getElements();

    double getLowLimit();

    double getHighLimit();

}
