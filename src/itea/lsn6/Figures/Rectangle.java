package itea.lsn6.Figures;

public class Rectangle extends Figure {

    public Rectangle() {
        nameF = "Rectangle";
        System.out.println(nameF + " constructor");
    }

    public void setHeight(int h) {
        heightF = h;
    }

    public void setWidth(int w) {
        widthF = w;
    }

    @Override
    public void drawFigure() {
        super.drawFigure();
        System.out.println(nameF);
        for (int i = 0; i < heightF; i++) {
            for (int j = 0; j < widthF; j++) {
                if (i == 0 || i == heightF - 1)
                    System.out.print("--");
                else
                if (j == 0)
                    System.out.print("|");
                else
                if (j == widthF - 1)
                    System.out.print("  |");
                else
                    System.out.print("  ");
                if (j == widthF - 1)
                    System.out.println();
            }
        }
    }

    @Override
    public double calcArea() {
        super.calcArea();
        s = widthF * heightF;
        return s;
    }
}