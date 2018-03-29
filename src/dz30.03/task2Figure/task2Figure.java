class task2Figure {
    public static void main(String[] args){
        Circle circle = new Circle(12, 4.5, 3, 6);
        System.out.println("\n");
        System.out.println("Circumference: " + circle.Perimetr() + " Square: " + circle.Square() + " Coordinates: x1 = " + circle.getX1() + ", y1 = " + circle.getY1() + "; " +
                " x2 = " + circle.getX2() + ", y2 = " + circle.getY2() + ";");
        Rectangle rectangle = new Rectangle(10, 5, 6, 5, 8, 9);
        System.out.println("Perimeter: " + rectangle.Perimetr() + " Square: " + rectangle.Square() + " Coordinates: x1 = " + rectangle.getX1() + ", y1 = " + rectangle.getY1() + "; " +
                " x2 = " + rectangle.getX2() + ", y2 = " + rectangle.getY2() + "; " + "x3 = " + rectangle.getX3() + ", y3 = " + rectangle.getY3() + ";");
        Triangle triangle = new Triangle(4, 5, 7, 8, 3, 5);
        System.out.println("Perimeter: " + triangle.Perimetr() + " Square: " + triangle.Square() + " Coordinates: x1 = " + triangle.getX1() + ", y1 = " + triangle.getY1() + "; " +
                " x2 = " + triangle.getX2() + ", y2 = " + triangle.getY2() + "; " + "x3 = " + triangle.getX3() + ", y3 = " + triangle.getY3() + ";");
    }
}



