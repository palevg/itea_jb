package itea.lsn4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Wrk_TimeDate2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.print("Enter the date&time (dd/MM/yyyy HH:mm:ss): ");
        String dtStr = sc.nextLine();
        try {
            Date dt = sdf.parse(dtStr);
            System.out.println(dt);
        } catch (ParseException e) {
            System.out.println("Wrong date!");
        }
        sc.close();
    }
}