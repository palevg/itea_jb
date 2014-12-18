package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_Func1 {
//Функция принимает в качестве аргументов одну строку X, целое число Y и число с плавающей точкой Z
// и возвращает как результат строку в виде S = x + y + z
    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String st1 = RL.readLine();
        System.out.print("Введите целое число: ");
        String str = RL.readLine();
        int ft1 = Integer.parseInt(str);
        System.out.print("Введите число с плавающей точкой: ");
        str = RL.readLine();
        double ft2 = Double.parseDouble(str);
        System.out.print("Результат: " + newStr(st1, ft1, ft2));
    }
    static String newStr(String s, int y, double z) {
        String rezlt = "S = " + s + " + " + y + " + " + z;
        return rezlt;
    }
}