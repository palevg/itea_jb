package itea.lsn4;

public class Wrk_ByteByByte1 {
    //побитовые операции
    static String toBinaryString (int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
    }

    static int setBit(int x, int pos) {
        return x | (1 << pos);
    }

    static int unsetBit(int x, int pos) {
        return x & ~(1 << pos);
    }

    static boolean isBitSet(int x, int pos) {
        return (x & (1 << pos)) != 0;
    }

    public static void main(String[] args) {
        int x = 45678;
        int y = 77646;

        System.out.println("  x = " + toBinaryString(x));
        System.out.println("  y = " + toBinaryString(y));

        System.out.println(" OR = " + toBinaryString(x | y));
        System.out.println("AND = " + toBinaryString(x & y));
        System.out.println("XOR = " + toBinaryString(x ^ y));
        System.out.println("NOT = " + toBinaryString(~x));

        int n = 3;
        System.out.println("  n = " + toBinaryString(n));
        System.out.println("  n = " + toBinaryString(setBit(n, 2)));
        System.out.println("  n = " + toBinaryString(unsetBit(n, 0)));
        System.out.println("  n = " + isBitSet(n, 1));
    }
}