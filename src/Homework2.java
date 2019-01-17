import java.util.Arrays;

public class Homework2 {

    public static void main(String[] args) {

        // задание 1

        int arr[] = {1,0,1,1,1,0,1,0,0,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1) {
                arr[i]=0;
            } else arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));

        // задание 2

        int mass[] = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass[i] + 3*i;
        }
        System.out.println(Arrays.toString(mass));

        // задание 3

        int mult[] = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int o: mult) {
            if (mult[o] < 6) {
                mult[o] = mult[o] * 2;
            }
        }
        System.out.println(Arrays.toString(mult));

        // задание 4

        int square[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == j || (i + j == 4)) {
                    square[i][j] = square[i][j] + 1;
                }
                System.out.print(square[i][j] + " ");
            }
        } System.out.println('\n');

        // задание 6
        System.out.println("Равны ли первый и послелний элемент массива?");
        int massive[] = {4,7,3,9,5,4};
        equal(massive);
        System.out.println(equal(massive));
    }

        // метод для задания 6

        public static boolean equal(int massive[]) {
            if (massive[0] == massive[(massive.length) - 1]) {
                return true;
            } else return false;
    }
}
