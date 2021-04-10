public class HomeWorkApp {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Ivanov Ivan", "director", "ivanov_director11@gmail.ru", "89081112233", 100000, 46);
        Employee secondEmployee = new Employee("Ivanov Andrey", "manager", "andrey00123@gmail.ru", "89045324878", 35000, 31);
        Employee thirdEmployee = new Employee("Danilov Maxim", "seller", "maxdanilov_007@mail.ru", "89536048563", 30000, 26);
        Employee forthEmployee = new Employee("Sergeeva Marina", "seller", "marishka_sergeeva@mail.ru", "89135144252", 30000, 32);
        Employee fifthEmployee = new Employee("Pavlenko Irina", "administrator", "irina_p789@yandex.ru", "89047529696", 35000, 30);

        firstEmployee.print();
        secondEmployee.print();
        thirdEmployee.print();
        forthEmployee.print();
        fifthEmployee.print();

        System.out.println();

        Employee[] emplArray = new Employee[5];
        emplArray[0] = firstEmployee;
        emplArray[1] = secondEmployee;
        emplArray[2] = thirdEmployee;
        emplArray[3] = forthEmployee;
        emplArray[4] = fifthEmployee;


        for (Employee empl : emplArray) {
            if (empl.getAge() > 40) empl.print();
        }

    }

}

