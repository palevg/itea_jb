package itea.lsn8.Wrk_RandomAccessFile;

import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws Exception {
        copyFile("D:\\1.txt");
        copyFile2("d:\\1.txt", "d:\\2.txt");
    }

    static void copyFile(String src) throws Exception { // запись и чтение из файла
        byte[] buf = new byte[10];
        RandomAccessFile in = new RandomAccessFile(src, "rw");
        try {
            in.seek(100);
            in.write(buf);
            in.writeInt(7);
            in.writeChars("hello!!!");

            //int x = in.readInt();
            //Boolean b = in.readBoolean();
        } finally {
            in.close();
        }
    }

    static void copyFile2(String src, String dest) throws Exception { // копирование файла по частям (буфер)
        RandomAccessFile in = new RandomAccessFile(src, "r");
        try {
            RandomAccessFile out = new RandomAccessFile(dest, "rw");
            try {
                byte[] buf = new byte[1024];
                int r;
                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0)
                        out.write(buf, 0, r);
                } while (r > 0);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}