public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.println("Ф.И.: " + name + ", должность: " + position + ", email: " + email + ", тел.: " + phone + ", заработная плата: " + salary + ", тыс. руб. " + ", возраст: " + age);
    }

    public int getAge() {
        return age;
    }

}

