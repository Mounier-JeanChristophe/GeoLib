public class Circle {

    private Point centerPoint;
    private double radius;

    public Circle(Point centerPoint, double radius){
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.pow(Math.PI * radius,2);
    }

}
