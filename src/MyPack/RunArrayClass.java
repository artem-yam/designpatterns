package MyPack;

/**
 * Подсчитать количество элементов, значения которых лежат в диапазоне от
 * lowLimit до highLimit. Если среднее арифметическое значений элементов, которые
 * лежат в этом диапазоне, превышает количество таких элементов, то обнулить
 * элементы с положительными значениями.
 */
public class RunArrayClass {
    public static void main(String[] args) {
        OneDimArray arrayObject =
                new OneDimIntArray(-50, 0, 3, 1, -8, 10, 25);
        System.out.println("Origin Array:");
        System.out.println(arrayObject);
        int lowLimit = 1;
        int highLimit = 12;
        int amount = arrayObject.getIntervalElementsAmount(lowLimit, highLimit);
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
