package itea.lsn4;

public class Wrk_task24_ArraysBytes {

    //Написать код, который позволит менять и читать значения произвольных битов в массиве байтов

    static int setBit(int x, int pos) {
        return x | (1 << pos);
    }

    static boolean isBitSet(int x, int pos) {
        return (x & (1 << pos)) != 0;
    }

    static void setBit(int[] a, int pos) {
        int intN = a.length - (pos / 32) - 1;
        int bitN = pos % 32;
        a[intN] = setBit(a[intN], bitN);
    }

    static boolean isBitSet(int[] a, int pos) {
        int intN = a.length - (pos / 32) - 1;
        int bitN = pos % 32;
        return isBitSet(a[intN], bitN);
    }

    public static void main(String[] args) {
        int[] a = {0, 0};

        setBit(a, 0);
        setBit(a, 1);
        setBit(a, 32);
        setBit(a, 63);

        System.out.println(isBitSet(a, 0));
        System.out.println(isBitSet(a, 1));
        System.out.println(isBitSet(a, 32));
        System.out.println(isBitSet(a, 63));
        System.out.println(isBitSet(a, 55)); // false!
    }
}