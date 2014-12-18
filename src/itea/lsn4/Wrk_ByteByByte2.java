package itea.lsn4;

public class Wrk_ByteByByte2 {
    //побитовые операции
    static String toBinaryString (int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 45678;

        System.out.println("x = " + Integer.toBinaryString(x));

        System.out.println("x = " + toBinaryString(x));
        System.out.println("y = " + toBinaryString(y));

        x = x << 1;
        System.out.println("x = " + toBinaryString(x));
        x <<= 2;
        System.out.println("x = " + toBinaryString(x));

        y >>= 1;
        System.out.println("y = " + toBinaryString(y));

        // x * 2
        int n = 2;
        System.out.println("n = " + toBinaryString(n));
        n *= 2;
        System.out.println("n = " + toBinaryString(n));
        n *= 4;
        System.out.println("n = " + toBinaryString(n));

        int m = 2;
        System.out.println("m = " + toBinaryString(m) + ", " + m);
        m <<= 1; // * 2
        System.out.println("m = " + toBinaryString(m) + ", " + m);
        m <<= 2; // * 4
        System.out.println("m = " + toBinaryString(m) + ", " + m);
        m >>= 1; // div 2
        System.out.println("m = " + toBinaryString(m) + ", " + m);
    }
}