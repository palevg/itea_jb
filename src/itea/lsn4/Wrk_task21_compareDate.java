package itea.lsn4;

import java.util.Calendar;
import java.util.Date;

public class Wrk_task21_compareDate {

//Ввести с консоли дату. Сравнить ее с текущей датой в системе. Вывести отличающиеся части (год, месяц) на экран.

//           НАЧАЛО РЕШЕНИЯ

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c2.setTime(new Date());

        if (! c1.equals(c2)) {
            int m1 = c1.get(Calendar.MILLISECOND);
            int m2 = c2.get(Calendar.MILLISECOND);

            if (m1 != m2)
                System.out.print(m1 + " - " + m2);

            // ...
        }
    }
}