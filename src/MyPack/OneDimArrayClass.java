package MyPack;

import java.util.Arrays;

public class OneDimArrayClass {
    private int[] dimArray;
    //private int amount = 0;
    //private int sum = 0;

    // Переменные amount и sum перенесены в метод

    // Возможно передавать уже созданный массив ???
    public OneDimArrayClass(int... args) {
        //this.dimArray = new int[args.length];
        //setArrayElem(args);
        this.dimArray = args;
    }

    //Лишний метод
    /*
    public final void setArrayElem(int... args) {
        for (int i = 0; i < args.length; i++) {
            this.dimArray[i] = args[i];
        }
    }
    */

    // Переменные amount и sum - локальные
    //Убрана переменная length;
    public int getAmountElementsArray(int lowLimit, int highLimit) {
        int amount = 0;
        int sum = 0;
        //int length = this.dimArray.length;
        for (int i = 0; i < this.dimArray.length; i++) {
            if ((this.dimArray[i] >= lowLimit) && (this.dimArray[i] <= highLimit)) {
                amount++;
                sum += this.dimArray[i];
            }
        }

        if ((amount != 0) && (sum / amount > amount)) {
            zeroPositiveElements();
        }

        return amount;
    }


    //Убраны параметры метода и закомментированный код с этими параметрами;
    //Убрана переменная length;
    //Возможно использование итератора вместо цикла for ???
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
