package itea.lsn8.Wrk_Monitor01;

import java.util.Scanner;

public class MonitorDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - мониторинг наличия указанных файлов в каталоге");
        System.out.println("2 - мониторинг каталога на добавление текстового файла");
        System.out.println("Любой другой ввод завершит работу программы.");
        System.out.print("Выберите задачу: ");
        int task = Integer.parseInt(sc.nextLine());
        if (task == 1) {  // мониторинг на наличие нескольких файлов
            String[] list = {"D:\\Temp\\1.txt", "D:\\Temp\\2.txt", "D:\\Temp\\3.txt", "D:\\Temp\\4.txt"};
            Monitor m = new Monitor(list, new FileEvent());
            m.start();
        }
        else
        if (task == 2) { // мониторинг каталога на добавление текстового файла
            MonitorDir m = new MonitorDir("D:\\Temp\\", ".txt");
            m.start();
        }
    }
}