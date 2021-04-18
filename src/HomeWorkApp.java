public class HomeWorkApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Алекс", 6);
        Cat cat2 = new Cat("Кекс", 8);
        Cat cat3 = new Cat("Персик", 8);
        Cat cat4 = new Cat("Марс", 10);
        Cat cat5 = new Cat("Оскар", 5);

        Cat[] cats = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        Plate plate = new Plate(40);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.isFullInfo();
        }
        plate.info();
        plate.increaseFood(15);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.isFullInfo();
        }
        plate.info();
    }
}
