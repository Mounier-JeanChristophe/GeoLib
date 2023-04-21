public class Circle {

    private final Point centerPoint;

    private final double radius;

    public Circle(Point centerPoint, double radius){
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getDiameter(){ return 2 * radius;}

    public Point getCenterPoint(){
        return this.centerPoint;
    }
}
