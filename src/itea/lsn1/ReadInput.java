package itea.lsn1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadInput {
    public static void main(String[] args) throws Exception {
        BufferedReader RTRT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первую строку: ");
        String a1 = RTRT.readLine();
        System.out.print("Введите вторую строку: ");
        String a2 = RTRT.readLine();
        System.out.print("Введите третью строку: ");
        String a3 = RTRT.readLine();
        System.out.println("Строка1 + строка3: " + a1 + a3);
        System.out.println("Строка3 + строка2 + строка1: " + a3 + a2 + a1);
        System.out.println("Строка1 + строка2 + строка3: " + a1 + a2 + a3);
        System.out.println();
        System.out.print("Введите первое число: ");
        a1 = RTRT.readLine();
        int i1 = Integer.parseInt(a1);
        System.out.print("Введите второе число: ");
        a2 = RTRT.readLine();
        int i2 = Integer.parseInt(a2);
        System.out.println();
        System.out.println("Сумма чисел: " + (i1 + i2));
        System.out.println("Разность чисел: " + (i1 - i2));
        System.out.println("Умножение чисел: " + (i1 * i2));
        System.out.println("Остаток от деления чисел: " + (i1 % i2));
//        System.out.println("Частное чисел: " + (float)(a1 / a2));
    }
}
