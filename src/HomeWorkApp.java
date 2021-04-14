public class HomeWorkApp {
    public static void main(String[] args) {
        Cat Vaska = new Cat("Васька");
        Dog Bobik = new Dog("Бобик");

        Vaska.swim(50);
        Bobik.swim(15);
        Bobik.swim(10);
        Vaska.run(300);
        Vaska.run(150);
        Bobik.run(600);
        Bobik.run(400);

        Cat Mashka = new Cat("Машка");
        Mashka.run(200);
        Mashka.swim(20);

        System.out.println("Мы создали " + Animal.animalCount + " животных!");
    }
}
