package itea.lsn9.Wrk_streams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Input file name: ");
        byte[] readedBytes = new byte[10];
        int q = new ConsoleInputStream().read(readedBytes);
        String str = new String(readedBytes, 0, q);

        FileInputStream f = new FileInputStream(str);
        q = f.read(readedBytes);
        str = new String(readedBytes, 0, q);
        System.out.println(str);
    }
}