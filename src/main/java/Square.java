public class Square extends Rectangle{

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    public double getPerimeter() {
        double lentgh = points.get(0).getDistance(points.get(1));
        return lentgh * 4;
    }

    @Override
    public double getArea() {
        double lentgh = points.get(0).getDistance(points.get(1));
        return (lentgh * lentgh);
    }
}
