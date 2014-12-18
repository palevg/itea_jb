package itea.lsn4;

import java.util.Arrays;

public class DZ_task11_2arraysTo1arr {

    // Дано два массива одинаковой длины, упорядоченных по возрастанию.
    // Объединить массивы так, чтобы получился один упорядоченный массив.
    // Пример: {1, 3, 10} + {2, 5, 8} = {1, 2, 3, 5, 8, 10}.

    public static void main(String[] args) {
        int[] ar1 = {1, 8, 10};
        int[] ar2 = {2, 5, 7};
        int[] ar3 = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;
        while (k < ar3.length) {
            if (i < ar1.length) {
                if (j < ar2.length) {
                    if (ar1[i] < ar2[j])
                        ar3[k++] = ar1[i++];
                    else
                        ar3[k++] = ar2[j++];
                }
                else
                    ar3[k++] = ar1[i++];
            }
            else
                ar3[k++] = ar2[j++];
        }
        System.out.println(Arrays.toString(ar3));
    }
}