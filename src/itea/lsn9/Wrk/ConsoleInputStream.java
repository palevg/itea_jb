package itea.lsn9.Wrk;

import java.io.IOException;

public class ConsoleInputStream extends InputStream {
    @Override
    public int read() throws IOException {
        return System.in.read();
    }
}