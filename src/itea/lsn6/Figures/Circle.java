package itea.lsn6.Figures;

public class Circle extends Figure {

    public Circle() {
        nameF = "Circle";
        System.out.println(nameF + " constructor");
    }

    public void setRadius(int r) {
        radiusF = r;
    }

    @Override
    public void drawFigure() {
        super.drawFigure();
        System.out.println(nameF);
    }

    @Override
    public double calcArea() {
        super.calcArea();
        s = Math.PI * radiusF * radiusF;
        return s;
    }
}