package itea.lsn8.Wrk_InputOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        copyFile("d:\\Temp\\1.txt", "d:\\Temp\\2.txt");
    }

    public static void copyFile(String src, String dest) throws Exception {
        FileInputStream in = new FileInputStream(src);
        try {
            FileOutputStream out = new FileOutputStream(dest);
            try {
                byte[] buf = new byte[1024]; // 1 KB
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