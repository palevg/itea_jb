package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array2_center {   //массив произвольного размера заполн. числами по возрастанию, начиная с центра

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов целочисленного массива: ");
        String str = RL.readLine();
        int countAr1 = Integer.parseInt(str);
        int[] ar1 = new int[countAr1];
        int centerAr1 = countAr1 / 2, i = centerAr1, j = centerAr1;
        System.out.print("Введите целое число, с которого начнётся заполнение массива: ");
        str = RL.readLine();
        int arValue = Integer.parseInt(str);
        ar1[centerAr1] = arValue;
        while (i >= 0 || j <= countAr1 - 1) {
            if (i >= 0) {
                ar1[i--] = arValue;
            }
            if (j <= countAr1 - 1) {
                ar1[j++] = arValue;
            }
            arValue++;
        }
        System.out.println("Наш массив: " + Arrays.toString(ar1));
    }
}