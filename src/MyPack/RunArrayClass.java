package MyPack;

/**
 * Подсчитать количество элементов, значения которых лежат в диапазоне от
 * lowLimit до hiLimit. Если среднее арифметическое значений элементов, которые
 * лежат в этом диапазоне, превышает количество таких элементов, то обнулить
 * элементы с положительными значениями.
 */
public class RunArrayClass {
    public static void main(String[] args) {
        OneDimArrayClass arrayObject =
                new OneDimArrayClass(-50, 0, 3, 1, -8, 10, 25);
        System.out.println("Origin Array:");
        System.out.println(arrayObject);
        int lowLimit = 1;
        int highLimit = 12;
        int amount = arrayObject.getAmountElementsArray(lowLimit, highLimit);
        if (amount != 0) {
            System.out.println("Amount of element belonging " +
                    "to a range from " + lowLimit + " to "
                    + highLimit + " = " + amount);
            System.out.println("Array after transformations:");
            System.out.println(arrayObject);
        } else {
            System.out.println("Array hasn't elements " +
                    "belonging to a given range");
        }
    }
}
