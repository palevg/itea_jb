package itea.lsn4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_task1_Array {

    //Найти все уникальные (не повторяющиеся)элементы массива.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов целочисленного массива: ");
        String str = br.readLine();
        int countAr1 = Integer.parseInt(str);
        int[] ar1 = new int[countAr1];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            str = br.readLine();
            ar1[i] = Integer.parseInt(str);
        }
        System.out.println("Наш массив: " + Arrays.toString(ar1));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ar1.length; i++) {
            int count = 0;
            for (int j = 0; j < ar1.length; j++) {
                if ((ar1[i] == ar1[j]) && (i != j))
                    count++;
            }
            if (count == 0) {
                if (sb.length() == 0)
                    sb.append(ar1[i]);
                else
                    sb.append(", " + ar1[i]);
            }
        }
        System.out.println("Уникальные элементы массива: " + sb);
    }
}