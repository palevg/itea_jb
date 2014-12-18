package itea.lsn4;

public class Wrk_task31_37 {

    public static void main(String[] args) {

    }
    static void task31() { //Вывести на экран все буквы английского алфавита
        for (char c = 'A'; c <= 'Z'; c++)
            System.out.print(c);
        System.out.println("");
    }

    static boolean task32(String s) { //Проверить баланс круглых скобок в выражении. Пример: “((x – 8)+a(y – 1))”.
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                b++;
            else if (s.charAt(i) == ')')
                b--;
        }
        return (b == 0);
    }
}
