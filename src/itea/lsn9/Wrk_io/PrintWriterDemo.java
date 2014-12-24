package itea.lsn9.Wrk_io;

import java.io.PrintWriter;

/**
 *
 */
public class PrintWriterDemo {
    public static void main(String args[]) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Hello world");
        int i = -128 - 1;
        pw.println(i);
        double d = 9.10938291e-31; //electron mass in kilograms
        pw.println(d);
    }
}