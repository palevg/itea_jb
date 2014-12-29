package itea.lsn12.DZ12;

import java.io.File;
import java.io.FilenameFilter;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран
 */
public class task3 {

    static String path = "C:\\Temp\\";

    public static void main(String[] args) throws Exception {
        // создаем список файлов из заданного каталога
        File file = new File(path);
        FilenameFilter filter = new NameFilter();
        String[] ar = file.list(filter);
        ArrayList list = new ArrayList();
        for (int i = 0; i < ar.length; i++)
            list.add(ar[i]);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        //System.out.println(list);
        //System.out.println();

    }

    static class NameFilter implements FilenameFilter {
        @Override
        public boolean accept(File dir, String name) {
            File file = new File(dir.getAbsoluteFile() + "\\" + name);
            return file.isFile();
        }
    }
}
