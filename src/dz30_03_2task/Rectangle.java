public class Rectangle {
    private double x1, x2, x3;
    private double y1, y2, y3;
    private double a, b, c;



    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        this.a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        this.b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        this.a = Math.abs(a);
        this.b = Math.abs(b);

    }

    public double Perimetr() {
        return (double) (2 * (a + b));
    }

    public double Square() {
        return (double) (a * b);
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }




    public double getY1() {
        return y1;
    }
    public double getX1() {
        return x1;
    }

    public double getY2() {
        return y2;
    }
    public double getX2() {
        return x2;
    }

    public double getY3() {
        return y3;
    }
    public double getX3() {
        return x3;
    }
}
