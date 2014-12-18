package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array1_zerk {   //зеркальный переворот элементов в массиве

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
        int[] ar2 = new int[countAr1];
        for (int i = 0; i < ar2.length; i++) {
            ar2[countAr1 - 1 - i] = ar1[i];
        }
        System.out.println("Зеркальный массив: " + Arrays.toString(ar2));
    }
}
