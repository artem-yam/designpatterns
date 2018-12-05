package MyPack;

public class ConsoleInfoOutput implements InfoOutput {

    @Override
    public void outputArray(OneDimArray array, String extraInfo) {
        System.out.println("-----------------------------------");
        System.out.println(extraInfo);
        System.out.println(array);
        System.out.println("-----------------------------------");
    }

    @Override
    public void outputArrayInfoAfterIntervalCheck(OneDimArray array, int lowLimit, int highLimit) {

        System.out.println("Amount of element belonging " +
                "to a range from " + lowLimit + " to "
                + highLimit + " = " + array.getIntervalElementsAmount());

        if (array.getIntervalElementsAmount() != 0) {
            System.out.println("Elements average value = " + String.format("%.3f", array.getIntervalElementsSum() / array.getIntervalElementsAmount()));
            outputArray(array, "Array after transformation: ");
        }
    }
}
