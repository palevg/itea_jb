package itea.lsn5.Wrk;

import itea.lsn5.Wrk.Rectangle;

public class RectMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 2);
        System.out.println(Rectangle.getName());
        System.out.println("R1: " + r1.getHeight() + " x " + r1.getWidth());
        System.out.println("R2: " + r2.getHeight() + " x " + r2.getWidth());
        r2.setHeight(22);
        r2.setWidth(33);
        System.out.println("R2: " + r2.getHeight() + " x " + r2.getWidth());
        r1.combine(r2);
        System.out.println("R1: " + r1.getHeight() + " x " + r1.getWidth());
        System.out.println("Площадь: " + r1.getSquad());
        System.out.println("Кол-во созданных обьектов: " + r1.getCount());
// r1.width = 100;
    }
}