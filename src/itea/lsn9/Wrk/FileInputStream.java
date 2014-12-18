package itea.lsn9.Wrk;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileInputStream extends InputStream {

    private RandomAccessFile file;

    public FileInputStream(String fileName) throws FileNotFoundException {
        this.file = new RandomAccessFile(fileName, "r");
    }

    @Override
    public int read() throws IOException {
        return file.read();
    }
}