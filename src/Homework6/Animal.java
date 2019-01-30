package Homework6;

public class Animal {

    private String name;
    private String breed;
    private String color;
    private int rundistance;
    private int swimdistance;
    private double jumpheight;

    public Animal(String name, String breed, String color){
        this.name = "Имя";
        this.breed = "Порода";
        this.color = "Цвет";
    }

    public boolean run(int rundistance) {
        System.out.println("Животное пробежало " + rundistance + " м.");
        return true;
    }

    public boolean swim(int swimdistance) {
        System.out.println("Животное проплыло " + swimdistance + " м.");
        return true;
    }

    public boolean jump(double jumpheight) {
        System.out.println("Животное прыгнуло на " + jumpheight + " м.");
        return true;
    }

}

class KittyCat extends Animal {

    public KittyCat(String name, String breed, String color){
        super(name, breed, color);
    }

    @Override
    public boolean run(int rundistance) {
        if (rundistance <= 200) {
            System.out.println("Кошка пробежала " + rundistance + " м.");
            return true;
        } else {
            System.out.println("Кошка не может пробежать так много!");
            return false;
        }
    }

    @Override
    public boolean swim(int swimdistance){
        System.out.println("Кошки не плавают!");
        return false;
    }

    @Override
    public boolean jump(double jumpheight){
        if (jumpheight <= 2) {
            System.out.println("Кошка прыгнула на " + jumpheight + " м.");
            return true;
        } else {
            System.out.println("Кошка не может прыгнуть так высоко!");
            return false;
        }
    }
}

class Dog extends Animal {

    public Dog(String name, String breed, String color){

        super(name, breed, color);

    }

    @Override
    public boolean run(int rundistance) {
        if (rundistance <= 500) {
            System.out.println("Собака пробежала " + rundistance + " м.");
            return true;
        } else {
            System.out.println("Собака не может пробежать так много!");
            return false;
        }
    }

    @Override
    public boolean swim(int swimdistance){
        if (swimdistance <= 10) {
            System.out.println("Собака проплыла " + swimdistance + " м.");
            return false;
        } else {
            System.out.println("Собака не может проплыть так много!");
            return false;
        }
    }

    @Override
    public boolean jump(double jumpheight){
        if (jumpheight <= 0.5) {
            System.out.println("Собака прыгнула на " + jumpheight + " м.");
            return true;
        } else {
            System.out.println("Собака не может прыгнуть так высоко!");
            return false;
        }
    }
}