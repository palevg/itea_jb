package itea.lsn6.Figures;

import java.util.Scanner;

public abstract class Figure {

    protected double s;
    protected String nameF;

    protected int widthF;
    protected int heightF;
    protected int F;
    protected int radiusF;

    public Figure() {
        //System.out.println("Figure constructor");
    }

    public int setValue(String value) {
        System.out.print("Введите " + value + " " + nameF + ": ");
        Scanner sc = new Scanner(System.in);
        F = Integer.parseInt(sc.nextLine());
        return F;
    }

    public void drawFigure() {
        System.out.print("Drawing ");
    }

    public double calcArea() {
        System.out.print("Calculating area of " + nameF + ": ");
        return s;
    }
}