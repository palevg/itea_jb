package itea.lsn8.Wrk_Monitor01;

import java.io.File;
import java.util.Date;

public class Monitor {
    String[] list;
    IFileEvent event;
    Date fileDate;

    public Monitor(String[] list, IFileEvent event) {
        this.list = list;
        this.event = event;
    }

    public void start() {

        String str = "";
        for (int i = 0; i < list.length; i++)
            str += "0";
        int count = 0;
        do {
            for (int i = 0; i < list.length; i++) {
                File f = new File(list[i]);
                if (f.exists() && f.isFile()) {
                    if (str.charAt(i) == '0') {
                        fileDate = new Date(f.lastModified());
                        if (event != null) {
                            count++;
                            StringBuilder sb = new StringBuilder();
                            for (int j = 0; j < list.length; j++) {
                                if (j == i)
                                    sb.append('1');
                                else
                                    sb.append(str.charAt(j));
                            }
                            str = sb.toString();
                            event.onFileAdded(list[i], fileDate); // выводит инфу о файле и его дате создания
                        }
                    }
                }
            }
            if (count < list.length) {
                delay(); // задержка
                System.out.println("Waiting...");
            }
        } while (count < list.length);

    }

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
            System.err.println("Thread interrupted!");
        }
    }
}