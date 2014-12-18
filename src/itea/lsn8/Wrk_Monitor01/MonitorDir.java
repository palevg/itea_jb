package itea.lsn8.Wrk_Monitor01;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class MonitorDir {

    private String path, ext;
    private static boolean flag = false;
    private static int count = 0;

    public MonitorDir(String path, String ext) {
        this.path = path;
        this.ext = ext;
    }

    static class MyFileFilter implements FilenameFilter {
        private String ext;

        public MyFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    private static void findFiles(String srcPath, String ext, ArrayList<String> list, boolean first) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));
        if (!first) {
            if (count != 0) {
                if (count != files.length)
                    flag = true;
            }
            else
            if (count != files.length)
                flag = true;
        }
        count = files.length;
        for (int i = 0; i < files.length; i++) {
            list.add(srcPath + files[i].getName());
        }
    }

    public void start() {

        ArrayList<String> list = new ArrayList<String>();
        try {
            findFiles(path, ext, list, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        do {
            try {
                findFiles(path, ext, list, false);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("Waiting...");
        } while (!flag);
        System.out.println("Обнаружено добавление текстового файла!");
    }
}