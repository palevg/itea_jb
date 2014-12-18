package itea.lsn4;

import java.math.BigInteger;
import java.util.Arrays;

public class Wrk_BigInteger {

    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1234567890123456789012345678901234567890");
        BigInteger i2 = new BigInteger("8901234567890123456789012345678901234567890123");

        System.out.println(i1.add(i2));
        System.out.println(i1.subtract(i2));
        System.out.println(i1.multiply(i2));

        byte[] b = i1.toByteArray();
        System.out.println(Arrays.toString(b));
    }
}