import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rectangle extends Polygon {

    public Rectangle(Point point1, Point point2, Point point3, Point point4){
        points = new ArrayList<>(Arrays.asList(point1,point2,point3,point4));
    }

    @Override
    public double getPerimeter() {
        double lentgh = points.get(0).getDistance(points.get(1));
        double witdh = points.get(1).getDistance(points.get(2));

        return (lentgh + witdh) * 2;
    }

    @Override
    public double getArea() {
        double lentgh = points.get(0).getDistance(points.get(1));
        double witdh = points.get(1).getDistance(points.get(2));


        return (lentgh * witdh);
    }
}
