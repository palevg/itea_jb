package itea.lsn2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array5 {

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество элементов целочисленного массива: ");
        String str = RL.readLine();
        int countAr1 = Integer.parseInt(str);
        int[] ar1 = new int[countAr1];
        for (int i = 0; i <= countAr1 - 1 ; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            str = RL.readLine();
            ar1[i] = Integer.parseInt(str);
        }
        System.out.println("Наш массив: " + Arrays.toString(ar1));
        int[] ar2 = new int[countAr1];
        for (int i = 0; i <= countAr1 - 1 ; i++) {
            ar2[countAr1 - 1 - i] = ar1[i];
        }
        System.out.println("Зеркальный массив: " + Arrays.toString(ar2));
        System.out.println();
        System.out.println("А теперь будем показывать эелементы массива. Для завершения работы - введите 0 (ноль).");
        int i;
        do {
            System.out.print("Введите номер элемента массива от 1 до " + countAr1 + ": ");
            str = RL.readLine();
            i = Integer.parseInt(str);
            if ((i > 0) & (i < countAr1 + 1)) {
                System.out.println("Значение элемента массива под номером " + i + " равно " + ar1[i - 1]);
            } else if (i != 0) {
                System.out.println("Вы ввели неверный номер элемента массива!");
            }
        } while (i != 0);
        System.out.println("Задача на 5+ выполнена! :)");
    }
}
