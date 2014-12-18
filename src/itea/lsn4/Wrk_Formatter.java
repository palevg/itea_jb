package itea.lsn4;

public class Wrk_Formatter {

    public static void main(String[] args) {
        String s1 = "string";
        int n = 20;

        String res = String.format("String: %s, number: %d", s1, n);
        System.out.println(res);
    }
}