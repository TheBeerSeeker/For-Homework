import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        //задание 2

        byte by = 42;
        short sh = 4200;
        int in = 420000000;
        long lo = 42000000000L;
        float fl = 42.42f;
        double db = 42.4242;
        boolean answer = false;
        char ch = '$';
        Scanner scan = new Scanner(System.in);

        //задание 3

        System.out.println("Сейчас я буду производить все вычисления!");
        int a = 100;
        int b = 200;
        int c = 300;
        int d = 400;
        System.out.println(calc(a, b, c, d));

        //задание 4

        System.out.println("Сейчас узнаем, равняется ли сумма чисел промежутку от 10 до 20!");
        System.out.println("Введите числа: ");
        int st = scan.nextInt();
        int nd = scan.nextInt();
        System.out.println(calc1(st, nd));

        //задание 5

        System.out.println("Сейчас узнаем, положительное число или отрицательное!");
        System.out.println("Введите число: ");
        int x = scan.nextInt();
        porn(x);

        //задание 6

        System.out.println("Сейчас узнаем, правда ли ваше число отрицательное!");
        System.out.println("Введите число: ");
        int y = scan.nextInt();
        nornot(y);
        System.out.println(nornot(y));

        //задание 7

        System.out.println("Как тебя зовут?");
        String yourname = scan.nextLine();
        name(yourname);

        //задание 8

        System.out.println("Сейчас узнаем, является ли год високосным!");
        System.out.println("Введи год:");
        int year = scan.nextInt();
        visgod(year);
        }

        //метод для задания 3

        public static int calc(int a, int b, int c, int d) {
            return a * (b + (c / d));
        }

        //метод для задания 4

        public static boolean calc1(int st, int nd) {
            if((st + nd) >= 10 && (st + nd) <= 20) {
                return true;
            } else return false;
        }

        //метод для задания 5

        public static void porn(int x) {
            if (x >= 0) {
                System.out.println("Положительное");
            } else System.out.println("Отрицательное");
        }

        //метод для задания 6

        public static boolean nornot(int y) {
            if (y < 0) {
                return true;
            } else return false;
        }

        //метод для задания 7

        public static void name(String yourname) {
            System.out.println("Привет, " + yourname + "!");
        }

        //метод для задания 8

        public static void visgod(int year) {
            if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println("Этот год високосный!");
            } else if ((year % 100 == 0) && (year % 400 != 0)) {
                System.out.println("Этот год не високосный!");
            } else if (year % 400 == 0) {
                System.out.println("Этот год високосный");
            } else System.out.println("Этот год не високосный!");
        }
}

