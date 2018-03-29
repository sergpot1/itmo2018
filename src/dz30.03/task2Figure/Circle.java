package task2Figure;

public class Circle {
        private double x1, x2;
        private double y1, y2;
        private double r;

        public Circle(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.r = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            this.r = Math.abs(r);
        }

        public double Perimetr() {
            return (double) (2 * Math.PI * r);
        }

        public double Square() {
            return (double) (Math.PI * r * r);
        }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x1 = x1;
    }

    public void setY2(double y2) {
        this.y1 = y1;
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

}
