package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array3_most {   //Найти в массиве число, которое повторяется наибольшее количество раз

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов целочисленного массива: ");
        String str = RL.readLine();
        int countAr1 = Integer.parseInt(str);
        int[] ar1 = new int[countAr1];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            str = RL.readLine();
            ar1[i] = Integer.parseInt(str);
        }
        System.out.println("Наш массив: " + Arrays.toString(ar1));
        int flag1, flagMax = 1, maxValue = ar1[0];
        for (int i = 0; i < ar1.length; i++) {
            flag1 = 1;
            for (int j = i + 1; j < ar1.length; j++) {
                if (ar1[i] == ar1[j])
                    flag1++;
            }
            if (flag1 > flagMax) {
                flagMax = flag1;
                maxValue = ar1[i];
            }
        }
        System.out.print("В массиве число " + maxValue + " встречается наибольшее кол-во раз, а именно - " + flagMax);
    }
}
