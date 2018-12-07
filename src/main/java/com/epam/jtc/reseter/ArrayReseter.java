package com.epam.jtc.reseter;

/**
 * ���������� ���������� ���������, �������� ������� ����� � ��������� ��
 * lowLimit �� highLimit. ���� ������� �������������� �������� ���������, �������
 * ����� � ���� ���������, ��������� ���������� ����� ���������, �� ��������
 * �������� � �������������� ����������.
 */
public class ArrayReseter {

    private InfoOutput infoOutput = new ConsoleInfoOutput();

    public static void main(String[] args) {

        ArrayReseter reseter = new ArrayReseter();

        reseter.handleArray(new NumericOneDimArrayClass(-50, 0, 3, 1, -8, 10, 25), 1, 12);
    }


    private void handleArray(NumericOneDimArray arrayObject, double lowLimit, double highLimit) {

        infoOutput.outputIntervalInfo(arrayObject, lowLimit, highLimit);

        NumericOneDimArray resetedArray = arrayObject.
                changeArrayDependingOnIntervalElements(lowLimit, highLimit);

        infoOutput.outputArray(resetedArray);
    }

}
