package itea.lsn4;

import java.util.Arrays;
import java.lang.Math;

public class DZ_task2_Function {

    // Построить таблицу значений ф-и на отрезке [-1; 0.75]

    static double funcX(double x) {
        double fX = x * (Math.pow((1 + (2 / (x + 7))), (x / 10)));
        return fX;
    }

    public static void main(String[] args) {
        double[] ar1 = {-1.0, -0.75, -0.5, -0.25, 0.0, 0.25, 0.5, 0.75};
        double[] ar2 = new double[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
            ar2[i] = funcX(ar1[i]);
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
    }
}