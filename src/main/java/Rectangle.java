import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Polygon {

    public Rectangle(Point point1, Point point2, Point point3, Point point4){
        points = new ArrayList<>(Arrays.asList(point1,point2,point3,point4));
    }

    @Override
    public double getPerimeter() {

        ArrayList<Double> dist = new ArrayList<>();
        for(int i = 1; i < 4; i++){
            dist.add(points.get(0).getDistance(points.get(i)));
        }
        dist.sort(Double::compareTo);
        return (dist.get(0) + dist.get(1)) * 2;
    }

    @Override
    public double getArea() {
        ArrayList<Double> dist = new ArrayList<>();
        for(int i = 1; i < 4; i++){
            dist.add(points.get(0).getDistance(points.get(i)));
        }
        dist.sort(Double::compareTo);
        return dist.get(0) * dist.get(1);
    }
}
