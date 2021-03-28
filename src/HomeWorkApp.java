public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Задание 2
    public static void printThreeWords()
    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 3

    public static void checkSumSign() {
        int a = 5;
        int b = -50;
        int sum = (a + b);

        if (0 <= sum) {
            System.out.println("Сумма положительная");
        }

        if (0 > sum) {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 4
    public static void printColor() {
        int value = 100;

        if (0 >= value) {
            System.out.println("Красный");
        }

        if (0 < value | value <= 100) {
            System.out.println("Желтый");
        }

        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    //Задание 5
    public static void compareNumbers() {
        int a = 500;
        int b = 200;

        if (a>=b) {
            System.out.println("a>=b");
        }

        else
            System.out.println("a<b");
    }
}
