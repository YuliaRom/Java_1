public class Cat {
    private String name;
    private int appetite;
    private boolean isFull = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
           }
    public void eat(Plate p) {
        if(appetite > p.getFood()) {
            System.out.println("Для " + name + " еды не хватило");
            this.isFull = false;
        } else {
            p.decreaseFood(appetite);
            this.isFull = true;
            System.out.println(name + " наелся");


        }
    }

    public void isFullInfo() {
        if(isFull) {
            System.out.println(name + " теперь сытый");

        } else {
            System.out.println(name + " остался голодный");
            }
        }
    }
