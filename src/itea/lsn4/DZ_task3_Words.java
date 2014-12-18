package itea.lsn4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ_task3_Words {

    //Найти в предложении самое короткое и самое длинное слово

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложение (со словами разной длины).");
        String str = br.readLine();
        String[] words = str.split(" ");
        String minW = words[0], maxW = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxW.length())
                maxW = words[i];
            if (words[i].length() < minW.length())
                minW = words[i];
        }
        System.out.print("Самое короткое слово - " + minW + "; самое длинное слово - " + maxW);
    }
}