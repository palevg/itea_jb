package itea.lsn2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array3 {

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
        int[] ar2 = new int[5];
        System.arraycopy(ar1, 0, ar2, 0, 5);
        System.out.println("Первая половинка главного массива: " + Arrays.toString(ar2));
        Arrays.sort(ar2);
        System.out.println("Первая половинка главного массива (отсортированная): " + Arrays.toString(ar2));
        int[] ar3 = Arrays.copyOfRange(ar1, 5, 10);
        System.out.println("Вторая половинка главного массива: " + Arrays.toString(ar3));
        Arrays.sort(ar3);
        System.out.println("Первая половинка главного массива (отсортированная): " + Arrays.toString(ar3));
    }
}
