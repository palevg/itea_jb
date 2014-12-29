package itea.lsn9.Wrk_streams;

import java.io.IOException;

public abstract class InputStream {

    public abstract int read() throws IOException;

    public int read(byte[] b) throws IOException {
        int i;
        for (i = 0; i < b.length; i++) {
            int _byte = read();
            if (_byte == -1) break;
            b[i] = (byte)_byte;
        }
        return i;
    }
}