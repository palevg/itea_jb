package itea.lsn9.Wrk_io;

import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 *
 */
public class DefaultEncoding {
    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset());
        System.out.println(new OutputStreamWriter(System.out).getEncoding());
    }
}
