package itea.lsn4;

public class Wrk_StringBuilder {

    public static void main(String[] args) {
        //1
        String s = "";
        for (int i = 0; i < 10; i++)
            s += "x";
        System.out.println(s);
        //2
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++)
            sb.append('x');
        System.out.println(sb.toString());
        //3
        sb = new StringBuilder("start-");
        for (int i = 0; i < 10; i++)
            sb.append('x');
        System.out.println(sb.toString());
        //4
        sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++)
            sb.append('x');
        System.out.println(sb.toString());
        //5
        sb = new StringBuilder("0123456789");
        sb.deleteCharAt(0);
        System.out.println(sb.toString());
        sb.insert(0, 'A');
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.append(777);
        System.out.println(sb.toString());
    }
}