package itea.lsn4;

public class DZ_task9_TablUmnozhen {

    // Вывести на экран таблицу умножения

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j < 10)
                    System.out.print(" ");
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}