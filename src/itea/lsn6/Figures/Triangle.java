package itea.lsn6.Figures;

public class Triangle extends Figure {

    public Triangle() {
        nameF = "Triangle";
        System.out.println(nameF + " constructor");
    }

    public void setSides() {
        heightF = super.setValue("длину 1-й стороны");
        widthF = super.setValue("длину 2-й стороны");
        radiusF = super.setValue("длину 3-й стороны");
    }

    @Override
    public void drawFigure() {
        super.drawFigure();
        System.out.println(nameF);
   }

    @Override
    public double calcArea() {
        super.calcArea();
        double p = (heightF + widthF + radiusF) / 2;
        if (p == heightF)
            s = Math.sqrt(p * (p - widthF) * (p - radiusF));
        else
        if (p == widthF)
            s = Math.sqrt(p * (p - heightF) * (p - radiusF));
        else
        if (p == radiusF)
            s = Math.sqrt(p * (p - heightF) * (p - widthF));
        else
            s = Math.sqrt(p * (p - heightF) * (p - widthF) * (p - radiusF));
        return s;
    }
}