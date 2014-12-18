package itea.lsn4;

public class Wrk_Strings {
//Дано текст. Убрать лишние пробелы, расставить знаки препинания.
//Пример: "Я    длинное    предложение Я второе      предложение." -> "Я длинное предложение. Я второе предложение."
    public static void main(String[] args) {
        final String text = "I     am very bad    text Please    fix me. Yes!";
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                sb.append(words[i]);
                if ((i + 1 < words.length) && (words[i + 1].length() > 0) &&
                        Character.isUpperCase(words[i + 1].charAt(0)) &&
                        (! words[i].endsWith("."))) {
                    sb.append(". ");
                }
                else
                    sb.append(' ');
            }
        }
        System.out.println(sb.toString());
        task1();
        task2();
        task3();
    }
    //Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е и 3-е слова местами и вывести на экран результат.
    static void task1() {
        String input = "word1 word2 word3";
        String[] parts = input.split(" ");
        String res = parts[2] + parts[1] + parts[0];
        System.out.println(res);
    }
    //Дано текст и определенное слово. Посчитать сколько раз заданное слово встречается в тексте.
    static  void  task2() {
        String word = "hello";
        String text = "hello just hello another hello and hello d";
        int pos = 0, count = 0;
        do {
            pos = text.indexOf(word, pos);
            if (pos >=0) {
                count++;
                pos += word.length();
            }
        } while (pos >=0);
        System.out.println("Слов hello в тексте: " + count);
    }
    //Дано 3 массива чисел. С помощью 1-2-х циклов найти сумму элементов во всех массивах.
    static  void  task3() {
        int[] ar1 = {1, 2, 3}, ar2 = {4, 5}, ar3 = {6, 7, 8};
        int[][] all = {ar1, ar2, ar3};
        int res = 0;
        for (int i = 0; i < all.length; i++) {
            for (int j = 0; j < all[i].length; j++)
                res += all[i][j];
        }
        System.out.println("Сумма элементов во всех массивах: " + res);
    }
}