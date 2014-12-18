package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class DZ_Func4 {

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов 1-го целочисленного массива: ");
        String str = RL.readLine();
        int countAr1 = Integer.parseInt(str);
        int[] ar1 = new int[countAr1];
        Random r = new Random();
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
        }
        System.out.print("Введите количество элементов 2-го целочисленного массива: ");
        str = RL.readLine();
        int countAr2 = Integer.parseInt(str);
        int[] ar2 = new int[countAr2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = r.nextInt(100);
        }
        System.out.println("1-й массив: " + Arrays.toString(ar1));
        System.out.println("2-й массив: " + Arrays.toString(ar2));
        System.out.println("Два массива вместе: " + Arrays.toString(sumArrays(ar1, ar2)));
    }
    //Функция объединяет два массива в один
    static int[] sumArrays(int[] ar1, int[] ar2) {
        int[] rezlt = new int[ar1.length + ar2.length];
        System.arraycopy(ar1, 0, rezlt, 0, ar1.length);
        System.arraycopy(ar2, 0, rezlt, ar1.length, ar2.length);
        return rezlt;
    }
}