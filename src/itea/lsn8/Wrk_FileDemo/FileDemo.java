package itea.lsn8.Wrk_FileDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileDemo {

    static String path = "D:\\";

    public static void main(String[] args) {

        File file = new File(path);
        FilenameFilter filter = new MyFilter();
        String[] ar = file.list(filter);
        System.out.println(Arrays.toString(ar));
    }

    static class MyFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            File file = new File(dir.getAbsoluteFile() + "\\" + name);
            return file.isFile();
        }
    }
}
