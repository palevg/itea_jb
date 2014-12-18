package itea.lsn4;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Wrk_TimeDate1 {

    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date dt1 = new Date(2014-1900, 7, 25);
        System.out.println("Какая-то дата: " + dt1);

        long ctm = System.currentTimeMillis(); //текущая дата и время
        Date dt2 = new Date(ctm);
        System.out.println("Текущая дата и время: " + dt2);

        System.out.println("Они одинаковые? " + dt1.equals(dt2));
        System.out.println("Сравнение 1-й со 2-й: " + dt1.compareTo(dt2));
        System.out.println("Сравнение 2-й с 1-й: " + dt2.compareTo(dt1));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        String res = sdf.format(dt2);
        System.out.println("Дата в заданном формате: " + res);

        sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        res = sdf.format(dt2);
        System.out.println("Дата в заданном формате: " + res);

        sdf = new SimpleDateFormat("dd.MM.yyyy DDD"); // day in year
        res = sdf.format(dt2);
        System.out.println("Дата в заданном формате: " + res);
    }
}