package itea.lsn3;

import java.util.Arrays;
import java.util.Random;

public class classWork_Cycles {
    public static void main(String[] args) {
        //1 - вывести на экран числа от 10 до 20 с помощью всех известных циклов
        System.out.print("Способ 1 (for): ");
        for (int i = 10; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Способ 2 (while): ");
        int w = 10;
        while (w <= 20) {
            System.out.print(w + " ");
            w++;
        }
        System.out.println();
        System.out.print("Способ 3 (do ... while): ");
        int k = 10;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 20);
        System.out.println();
        System.out.print("Способ 4 (for-each): ");
        int[] ar10 = new int[11];
        for (int m = 0; m <= 10; m++) {
            ar10[m] = m + 10;
        }
        for (int xx : ar10) {
            System.out.print(xx + " ");
        }
        System.out.println();
        System.out.println();
        //2 - числа от 0 до 100, делящиеся на 3 без остатка
        System.out.println("Числа от 0 до 100, делящиеся на 3 без остатка");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i);
                if (i < 100) System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();
        //3 - массив чисел от 100 до 0
        System.out.println("Массив чисел от 100 до 0");
        int[] ar1 = new int[101];
        for (int i = 0, j = 100; i <= 100; i++, j--) {
            ar1[i] = j;
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println();
        //4 - есть массив из 10 целых чисел, вывести сумму его элементов кроме 1-го и 10-го
        System.out.println("Есть массив из 10 целых чисел, вывести сумму его элементов кроме 1-го и 10-го");
        int[] ar2 = new int[10];
        Random r = new Random();
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = r.nextInt(30);
        }
        int sum = 0;
        for (int i = 1; i < ar2.length - 1; i++) {
            sum += ar2[i];
        }
        System.out.println("Наш массив: " + Arrays.toString(ar2) + ", сумма = " + sum);
    }
}