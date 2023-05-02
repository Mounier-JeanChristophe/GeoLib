package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Vectors.Vector2;

import java.util.ArrayList;

/**
 * Rectangle class. A class to create a rectangle and process calculations on it.
 * @author Kilian QUITTARD, JC MOUNIER
 */

public class Rectangle extends Polygon {

    /**
     * Constructor for creating a rectangle.
     * @param point1 Shapes2D.Point of the rectangle.
     * @param point2 Shapes2D.Point of the rectangle.
     * @param point3 Shapes2D.Point of the rectangle.
     * @param point4 Shapes2D.Point of the rectangle.
     */
    public Rectangle(Vector2 point1, Vector2 point2, Vector2 point3, Vector2 point4) throws DistanceException {
        super(point1,point2,point3,point4);

        ArrayList<Double> dist = new ArrayList<>();
        double max_dist = -1;
        int max_id = 0;

        // get all distances from first point
        for(int i = 1; i < 4; i++) {
            double distance = vectors.get(0).getDistance(vectors.get(i));
            if(!dist.contains(distance)){
                dist.add(distance);
                if(distance > max_dist){
                    max_dist = distance;
                    max_id = i;
                }
            }
        }

        //get adjacent points
        ArrayList<Vector2> adjPoint = new ArrayList<>();
        for(int i = 1; i < 4; i++) {
            if(i != max_id){
                adjPoint.add(vectors.get(i));
            }
        }
        double dist1 = vectors.get(0).getDistance(adjPoint.get(0));
        double dist1opp = vectors.get(max_id).getDistance(adjPoint.get(1));
        double dist2 = vectors.get(0).getDistance(adjPoint.get(1));
        double dist2opp = vectors.get(max_id).getDistance(adjPoint.get(0));

        if(dist1 != dist1opp || dist2 != dist2opp) {
            throw new DistanceException("Invalid rectangle: cannot have more than 2 different distances");
        }

    }

    /**
     * Calculate the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        ArrayList<Double> dist = new ArrayList<>();
        for(int i = 1; i < 4; i++){
            dist.add(vectors.get(0).getDistance(vectors.get(i)));
        }
        dist.sort(Double::compareTo);
        return (dist.get(0) + dist.get(1)) * 2;
    }

    /**
     * Calculate the area of the rectangle.
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        ArrayList<Double> dist = new ArrayList<>();
        for(int i = 1; i < 4; i++){
            dist.add(vectors.get(0).getDistance(vectors.get(i)));
        }
        dist.sort(Double::compareTo);
        return dist.get(0) * dist.get(1);
    }
}