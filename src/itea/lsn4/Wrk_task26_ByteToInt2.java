package itea.lsn4;

public class Wrk_task26_ByteToInt2 {

    //Ввести с консоли целое число, посчитать количество единиц в его бинарном представлении (“1011” –> 3)

    public static void main(String[] args) {
        int n = 117, count = 0; // 1110101
        while (n != 0) {
            if (n % 2 > 0)
                count++;
            n /= 2;
        }
        System.out.println(count);
    }
}