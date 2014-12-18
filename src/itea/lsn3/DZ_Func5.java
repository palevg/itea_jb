package itea.lsn3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DZ_Func5 {
//модифицированный проект "калькулятор", каждое математическое действие выполняется в отдельном методе
    public static void main(String[] args) throws Exception {
        BufferedReader RTRT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        String str = RTRT.readLine();
        double i1 = Double.parseDouble(str);
        System.out.print("Введите второе число: ");
        str = RTRT.readLine();
        double i2 = Double.parseDouble(str);
        System.out.println();
        System.out.println("Сумма чисел: " + sumCalc(i1, i2));
        System.out.println("Разность чисел: " + raznCalc(i1, i2));
        System.out.println("Умножение чисел: " + mnozCalc(i1, i2));
        System.out.println("Частное чисел: " + delCalc(i1, i2));
    }
    //сумма
    static double sumCalc(double x, double y) {
        double rezlt = x + y;
        return rezlt;
    }
    //вычитание
    static double raznCalc(double x, double y) {
        double rezlt = x - y;
        return rezlt;
    }
    //умножение
    static double mnozCalc(double x, double y) {
        double rezlt = x * y;
        return rezlt;
    }
    //деление
    static double delCalc(double x, double y) {
        double rezlt = x / y;
        return rezlt;
    }
}