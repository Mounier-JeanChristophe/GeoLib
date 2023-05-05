package Shapes2D;

import Shapes2D.Exceptions.DistanceException;
import Shapes2D.Exceptions.SameCoordinateException;
import Vectors.Vector2;
import Vectors.Vector3;

import java.util.ArrayList;

/**
 * Square class. A class to create a square and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Square extends Rectangle{

    /**
     * Constructor for creating a square.
     * @param point1 Shapes2D.Point of the square.
     * @param point2 Shapes2D.Point of the square.
     * @param point3 Shapes2D.Point of the square.
     * @param point4 Shapes2D.Point of the square.
     */
    public Square(Vector2 point1, Vector2 point2, Vector2 point3, Vector2 point4) throws DistanceException {
        super(point1, point2, point3, point4);

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
        // get all distances from diagonal point
        for(int i = 0; i < 4; i++) {
            double distance = vectors.get(max_id).getDistance(vectors.get(i));
            if (!dist.contains(distance) && max_id != i) {
                dist.add(distance);
            }
        }
        if(dist.size() != 2){
            throw new DistanceException("Invalid square: not all sides have equal lengths");
        }
    }

    /**
     * Calculate the perimeter of the square.
     * @return The perimeter of the square.
     */
    @Override
    public double getPerimeter() {
        double lentgh = vectors.get(0).getDistance(vectors.get(1));
        return lentgh * 4;
    }

    /**
     * Calculate the area of the square.
     * @return The area of the square.
     */
    @Override
    public double getArea() {
        double lentgh = vectors.get(0).getDistance(vectors.get(1));
        return (lentgh * lentgh);
    }

    public Vector2 getCenter() {
        double sumX = 0;
        double sumY = 0;
        for (Vector2 vertex : vectors) {
            sumX += vertex.getX();
            sumY += vertex.getY();
        }
        double centerX = sumX / 4;
        double centerY = sumY / 4;
        return new Vector2(centerX, centerY);
    }
}