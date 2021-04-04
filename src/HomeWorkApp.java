import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        //1
        change0and1();
        //2
        emptyArray();
        //3
        lessThan6();
        //4
        diagonal();
        //5
        int[] result = someMethod(7, 1);
        System.out.println(Arrays.toString(result));
        //6
        minMax();
        //7
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(balance(array));

    }

    //Задание 1
    public static void change0and1() {
        int[] array = new int[5];
        array[2] = 1;
        array[4] = 1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //Задание 2
    public static void emptyArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;

        System.out.println(Arrays.toString(array));
    }

    //Задание 3
    public static void lessThan6() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //Задание 4
    public static void diagonal() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j) || ((i + j) == (array.length - 1))) {
                    array[i][j] = 1;
                }
            }
        for (int i = 0; i < array.length; i++)
            System.out.println(Arrays.toString(array[i]));

    }

    //Задание 5
    public static int[] someMethod(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //Задание 6
    public static void minMax() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            int min = array[0];
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }

                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println("Минимальное значение " + min);
            System.out.println("Максимальное значение " + max);
        }
    }

    //Задание 7
    public static boolean balance(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }

            for (int n = i; n < array.length; n++) {
                {
                    rightSum += array[n];
                }
                if (leftSum == rightSum) {
                    return true;
                }
            }
        }
        return false;
    }
}

