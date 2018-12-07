package com.epam.jtc.reseter;

public interface InfoOutput {

    void outputArray(NumericOneDimArray array, String... extraInfo);

    void outputStrings(String... stringsForOutput);

    void outputArrayInfoAfterIntervalCheck(NumericOneDimArray array, double lowLimit, double highLimit);
}
