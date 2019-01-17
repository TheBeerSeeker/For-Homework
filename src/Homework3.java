import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

        // задание 1

        guessnumb();

        // задание 2

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        guessword(words);
    }

    // метод для задания 1

    private static void guessnumb() {
        Random rand = new Random();
        int r = rand.nextInt(10);
        System.out.println("Угадай число, которое я загадал! >:)");
        Scanner gonnascan = new Scanner(System.in);
        Scanner gonnascan1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Твое число: ");
            int n = gonnascan.nextInt();
            if (n != r) {
                System.out.println("Не угадал >:]");
                if (i==2) {
                    System.out.println("Ты проиграл!");
                    System.out.println("Сыграем еще? 1-да, 0-нет");
                    int q1 = gonnascan1.nextInt();
                    while (q1 != 1 && q1 != 0) {
                        System.out.println("Нужно ввести 0 или 1!");
                        q1 = gonnascan1.nextInt();
                    }
                    if (q1 == 1) {
                        Homework3.guessnumb();
                      } else {
                        System.out.println("Спасибо за игру!");
                        break;
                    }
                }
            } else {
                System.out.println("Угадал!");
                System.out.println("Сыграем еще? 1-да, 0-нет");
                int q = gonnascan1.nextInt();
                while ((q != 1) && (q != 0)) {
                    System.out.println("Нужно ввести 0 или 1!");
                    q = gonnascan1.nextInt();
                }
                if (q == 1) {
                    Homework3.guessnumb();
                } else {
                    System.out.println("Спасибо за игру!");
                    break;
                }
             }
        } System.out.println();
    }

    // метод для задания 2
    private static void guessword(String[] words) {
        Random rand1 = new Random();
        System.out.println("Угадай слово :Р");
        String rw = words[rand1.nextInt(words.length)];
        String gw = "A";
        while (!gw.equals(rw)) {
            Scanner scan = new Scanner(System.in);
            gw = scan.nextLine();
            if (!gw.equals(rw)) {
                System.out.println("Не угадал!");
                if (rw.charAt(0) == gw.charAt(0)) {
                    System.out.print(rw.charAt(0));
                } else System.out.print("#");
                if (rw.charAt(1) == gw.charAt(1)) {
                    System.out.print(rw.charAt(1));
                } else System.out.print("#");
                if(rw.length() > 3 && gw.length() > 3) {
                    if (rw.charAt(2) == gw.charAt(2)) {
                        System.out.print(rw.charAt(2));
                    } else System.out.print("#");
                }
                if (rw.length() > 4 && gw.length() > 4) {
                    if (rw.charAt(3) == gw.charAt(3)) {
                        System.out.print(rw.charAt(3));
                    } else System.out.print("#");
                }
                if (rw.length() > 5 && gw.length() > 5) {
                    if (rw.charAt(4) == gw.charAt(4)) {
                        System.out.print(rw.charAt(4));
                    } else System.out.print("#");
                }
                if (rw.length() > 6 && gw.length() > 6) {
                    if (rw.charAt(5) == gw.charAt(5)) {
                        System.out.print(rw.charAt(5));
                    } else System.out.print("#");
                }
                if (rw.length() > 7 && gw.length() > 7) {
                    if (rw.charAt(6) == gw.charAt(6)) {
                        System.out.print(rw.charAt(6));
                    } else System.out.print("#");
                }
                if (rw.length() > 8 && gw.length() > 8) {
                    if (rw.charAt(7) == gw.charAt(7)) {
                        System.out.print(rw.charAt(7));
                    } else System.out.print("#");
                }
            }
            System.out.println("######");
            System.out.println("Еще варианты?");
        }
            if (gw.equals(rw)) {
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Угадали!");
                System.out.println("Сыграем еще? 1-да, 0-нет");
                int q2 = scan1.nextInt();
                while ((q2 != 1) && (q2 != 0)) {
                    System.out.println("Нужно ввести 0 или 1!");
                    q2 = scan1.nextInt();
                }
                if (q2 == 1) {
                    Homework3.guessword(words);
                } else {
                    System.out.println("Спасибо за игру!");
                }
            }
        }
    }