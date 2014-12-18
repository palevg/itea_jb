package itea.lsn5.Wrk;

public class Rectangle {
    private int width, height;
    private static final String NAME = "Прямоугольник";
    public static int count = 0;
    public Rectangle() {
        width = 10;
        height = 5;
        count++;
    }
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        count++;
    }
    public static String getName() {
        return NAME;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int h) {
        height = h;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int w) {
        width = w;
    }
    public void combine(Rectangle r) {
        width += r.width;
        height += r.height;
    }
    public int getSquad() {
        int s = width * height;
        return s;
    }
    public int getCount() {
        return count;
    }
}