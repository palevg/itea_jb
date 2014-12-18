package itea.lsn5.Triangle;

import java.io.IOException;

public class TriangleMain {

    public static void main(String[] args) throws IOException {
        Triangle tr1 = new Triangle();
        tr1.setSide();
        System.out.println("Площадь треугольника - " + tr1.areaTriangle());
        Triangle tr2 = new Triangle();
        tr2.setSide();
        System.out.println("Площадь треугольника - " + tr2.areaTriangle());
        Triangle tr3 = new Triangle(5, 9, 11);
        System.out.println("Площадь треугольника - " + tr3.areaTriangle());
    }
}