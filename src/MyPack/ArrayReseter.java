package MyPack;

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

        reseter.handleArray(new OneDimIntArray(-50, 0, 3, 1, -8, 10, 25), 1, 12);
    }


    private void handleArray(OneDimArray arrayObject, int lowLimit, int highLimit) {

        infoOutput.outputArray(arrayObject, "Origin Array:");

        arrayObject.checkArrayForReset(lowLimit, highLimit);

        infoOutput.outputArrayInfoAfterIntervalCheck(arrayObject, lowLimit, highLimit);

    }

}
