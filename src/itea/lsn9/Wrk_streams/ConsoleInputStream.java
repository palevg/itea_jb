package itea.lsn9.Wrk_streams;

import java.io.IOException;

public class ConsoleInputStream extends InputStream {
    @Override
    public int read() throws IOException {
        return System.in.read();
    }
}