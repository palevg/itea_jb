package itea.lsn1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader RTRT = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int[] ar1 = new int[5];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            str = RTRT.readLine();
            ar1[i] = Integer.parseInt(str);
        }
        System.out.println(Arrays.toString(ar1));
    }
}
