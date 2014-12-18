package itea.lsn5.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    private int side1, side2, side3;

    public Triangle(int s1, int s2, int s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public double areaTriangle() {
        double p = (side1 + side2 + side3) / 2;
        if (p == side1 || p == side2 || p == side3)
            p += 0.000001;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;
    }

    private int enterSide(int side) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите длину стороны треугольника: ");
        String str = br.readLine();
        return side = Integer.parseInt(str);
    }

    public void setSide() throws IOException {
        this.side1 = enterSide(side1);
        this.side2 = enterSide(side2);
        this.side3 = enterSide(side3);
    }
}