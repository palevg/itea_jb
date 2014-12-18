package itea.lsn4;

public class DZ_task4_StringReplace {

    // Написать аналог String.replace()

    public static void main(String[] args) {
        String s = "Самое короткое слово";
        //s.replace('о', '1');
        s.replace("рот", "123");
        System.out.println(s);
    }
}