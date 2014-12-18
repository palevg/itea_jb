package itea.lsn3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_Array4_math {   //программа для подсчета значения математического выражения, введенного из консоли

    public static void main(String[] args) throws IOException {
        BufferedReader RL = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = RL.readLine();
        int i = 0, strLength = str.length();
        String st1 = new String();
        do {
            st1 += str.charAt(i++);
        } while (!checkMath(str.charAt(i)));
        float rezlt = Integer.parseInt(st1);
        st1 = "";
        for (int j = i + 1; j < strLength; j++) {
            if (!checkMath(str.charAt(j))) {
                st1 += str.charAt(j);
            }
            if (j == strLength - 1 || checkMath(str.charAt(j))) {
                float ft1 = Integer.parseInt(st1);
                if (str.charAt(i) == '*') {
                    rezlt = rezlt * ft1;
                } else if (str.charAt(i) == '/') {
                    rezlt = rezlt / ft1;
                } else if (str.charAt(i) == '+') {
                    rezlt = rezlt + ft1;
                } else rezlt = rezlt - ft1;
                st1 = "";
                i = j;
            }
        }
        System.out.print("Решение математического выражения = " + rezlt);
    }
    static boolean checkMath(char s) {
        boolean charMath = false;
        switch (s) {
            case '+':
                charMath = true;
                break;
            case '-':
                charMath = true;
                break;
            case '*':
                charMath = true;
                break;
            case '/':
                charMath = true;
                break;
            default:
                charMath = false;
                break;
        }
        return charMath;
    }
}
