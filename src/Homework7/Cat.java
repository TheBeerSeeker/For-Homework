package Homework7;

public class Cat {
    boolean satiety;
    private String name;
    private int appetite;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        System.out.println("Кот " + name + " пытается поесть...");
        if (p.decreaseFood(appetite)) {
            System.out.println("Кот " + name + " поел.");
            satiety = true;
        } else {
            System.out.println("Коту " + name + " не хватило еды, и он не станет есть!");
            System.out.println("Кот " + name + " не поел.");
            satiety = false;
        }
    }

    public void isSatiety() {
        if(satiety) {
            System.out.println("Кот " + name + " сыт!");
        } else System.out.println("Кот " + name + " голоден!");
    }
}


class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (food > n) {
            food -= n;
            return true;
        } else return false;
    }
    // public void info() { System.out.println("В тарелке осталось: " + food); }
    String info = "В тарелке осталось: ";
    public void info() { System.out.println(info + food); }
    public void plateFilling(int f) {
        food+=f;
        System.out.println("Наполняем миску на " + f);
        System.out.print("Теперь " + info.toLowerCase() + food);
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Мурзик", 15);
        cats[2] = new Cat("Пушок", 10);
        cats[3] = new Cat("Беляш", 15);
        cats[4] = new Cat("Ракета", 20);
        Plate plate = new Plate(50);
        plate.info();
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            plate.info();
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < cats.length; i++) {
            cats[i].isSatiety();
        }
        System.out.println();
        plate.plateFilling(20);
        System.out.println();
        cats[4].eat(plate);
        cats[4].isSatiety();
        plate.info();
    }
}
