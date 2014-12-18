package itea.lsn2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array1 {

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводим целочисленный массив из 10-ти элементов.");
        String str;
        int[] ar1 = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            str = RL.readLine();
            ar1[i] = Integer.parseInt(str);
        }
        System.out.println("Наш массив: " + Arrays.toString(ar1));
        Arrays.sort(ar1);
        System.out.println("Отсортированный массив: " + Arrays.toString(ar1));
    }
}
