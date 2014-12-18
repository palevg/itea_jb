package itea.lsn8.Wrk_LinesReader;

import java.io.RandomAccessFile;

public class Events2 implements IEvents {

    public void onNewLine(String line) {
        String s = line + "\r\n"; // конец строки
        try {
            RandomAccessFile r = new RandomAccessFile("c:\\Temp\\1.txt", "rw");
            try {
                r.seek(r.length());
                r.write(s.getBytes());
            } finally {
                r.close();
            }
        } catch (Exception ex) {}
    }

    @Override
    public void onError(String msg) {

    }
}