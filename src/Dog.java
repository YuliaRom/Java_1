public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int length) {
        if(length > 500) {
            System.out.println("Слишком длинная дистанция. Собака столько пробежать не может");
        } else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        if(length > 10) {
            System.out.println("Слишком длинная дистанция. Собака столько проплыть не может");
        } else {
            super.swim(length);
        }
    }
}
