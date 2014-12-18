package itea.lsn8.DZ85_CopyFiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Main {

    static String pathTarg = "D:\\11\\";
    static String pathDest = "D:\\22\\";

    public static void main(String[] args) throws Exception {
        // копирование всех файлов из одного каталога в другой
        File file = new File(pathTarg);
        FilenameFilter filter = new MyFilter();
        String[] ar = file.list(filter);
        for (int i = 0; i < ar.length; i++) {
            FileInputStream in = new FileInputStream(pathTarg + ar[i]);
            try {
                FileOutputStream out = new FileOutputStream(pathDest + ar[i]);
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

    static class MyFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            File file = new File(dir.getAbsoluteFile() + "\\" + name);
            return file.isFile();
        }
    }
}