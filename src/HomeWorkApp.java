public class HomeWorkApp {
    public static void main(String[] args) {

        //1
        int a = 5;
        int b = -10;
        boolean c = sumBetween10and20(a,b);
        System.out.println(c);

        //2
        positiveOrNegative(-8);

        //3
        boolean z = positiveOrNegative2(100);
        System.out.println(z);

        //4
        textNTimes();

        //5
        boolean d = leapYear(2000);
        System.out.println(d);
    }

    //Задание 1
    public static boolean sumBetween10and20(int a, int b) {
        int sum = (a + b);
        if (sum > 10 && sum <= 20)
            {return true;}
        else
            {return false;}
    }

    //Задание 2
    public static void positiveOrNegative (int x) {
        if (x >= 0)
            System.out.println("Положительное число");
        else
            System.out.println("Отрицательное число");
    }

    //Задание 3
    public static boolean positiveOrNegative2(int y) {
        if (y >= 0)
        {return true;}
        else
        {return false;}
    }

    //Задание 4
    public static void textNTimes () {
        String text = ("Домашнее задание 2");
        for (int n = 0; n < 5; n++) {
            System.out.println(text);
        }
    }

    //Задание 5
    public static boolean leapYear (int year) {
        if (year % 4 == 0 && year % 100 !=0)
        {return true;}

        else if (year % 400 == 0)
        {return true;}

        else
        {return false;}
    }
}

