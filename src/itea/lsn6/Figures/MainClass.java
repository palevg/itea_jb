package itea.lsn6.Figures;

public class MainClass {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setHeight(r1.setValue("высоту"));
        r1.setWidth(r1.setValue("ширину"));
        r1.drawFigure();
        System.out.println(r1.calcArea());
        System.out.println("---");

        Triangle t1 = new Triangle();
        t1.setSides();
        System.out.println(t1.calcArea());
        System.out.println("---");

        Circle c1 = new Circle();
        c1.setRadius(c1.setValue("радиус"));
        System.out.println(c1.calcArea());
    }
}