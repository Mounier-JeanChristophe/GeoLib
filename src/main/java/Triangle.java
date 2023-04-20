import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Polygon {

    public Triangle(Point point1, Point point2, Point point3){
        points = new ArrayList<>(Arrays.asList(point1,point2,point3));
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0.0;
        int size = points.size()-1;
        for(int i = 0; i < size; i++){
            perimeter += points.get(i).getDistance(points.get(i+1));
        }
        return perimeter;
    }

    @Override
    public double getArea() {
        double base = points.get(0).getDistance(points.get(1));
        double height = findHeight();
        return (base * height) /2;
    }

    private double findHeight() {
        Point point1 = points.get(0);
        Point point2 = points.get(1);
        Point point3 = points.get(2);

        double a = point2.getY() - point1.getY();
        double b = point1.getX() - point2.getX();
        double c = -a * point1.getX() - b * point1.getY();
        return Math.abs((a * point3.getX() + b * point3.getY() + c) / Math.sqrt(a * a + b * b));
    }
}
