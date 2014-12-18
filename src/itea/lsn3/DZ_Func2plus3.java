package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class DZ_Func2plus3 {

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов целочисленного массива: ");
        String str = RL.readLine();
        int countAr1 = Integer.parseInt(str);
        long[] ar1 = new long[countAr1];
        Random r = new Random();
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(70000);
        }
        System.out.println("Наш массив: " + Arrays.toString(ar1) + ", сумма первых трёх (+1) = " + sumArray(ar1));
        System.out.println("Длина массива в байтах = " + sumByte(ar1));
    }
    //Функция принимает массив чисел в качестве аргумента,
    // увеличивает его первые 3 элемента на 1 и возвращает на экран их сумму
    static int sumArray(long[] ar1) {
        int rezlt = 0;
        for (int i = 0; i < 3; i++) {
            rezlt += ar1[i] + 1;
        }
        return rezlt;
    }
    //Функция принимает на вход массив чисел и возвращает его длину в байтах как результат
    static byte sumByte(long[] ar1) {
        byte rezlt = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (ar1[i] >= -128 && ar1[i] <= 127) {
                rezlt += 1;
            } else if ((ar1[i] >= -32768 && ar1[i] <= -128) || (ar1[i] >= 127 && ar1[i] <= 32767)) {
                rezlt += 2;
            } else if ((ar1[i] >= -2147483648 && ar1[i] <= -32768) || (ar1[i] >= 32767 && ar1[i] <= 2147483647)) {
                rezlt += 4;
            } else rezlt += 8;
        }
        return rezlt;
    }
}