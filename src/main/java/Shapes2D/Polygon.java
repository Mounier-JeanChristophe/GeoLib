package Shapes2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Polygon class. A class to create any Polygon and process calculations on it.
 * @author Kilian QUITTARD
 */

public class Polygon {

    /**
     * List of points that compose the polygon.
     */
    protected List<Point> points;

    /**
     * Constructor for creating a polygon.
     * @param points Shapes2D.Points that composed the polygon.
     */
    public Polygon(Point... points){
        this.points = new ArrayList<>();
        for(Point point : points){
            this.points.add(point);
        }
    }

    /**
     * Calculate the perimeter for every polygon.
     * @return The perimeter of the polygon.
     */
    public double getPerimeter(){
        double perimeter = 0.0;
        int size = points.size();
        for(int i = 0; i < size-1; i++){
            perimeter += points.get(i).getDistance(points.get(i+1));
        }
        perimeter += points.get(size-1).getDistance(points.get(0));
        return perimeter;
    }

    /**
     * Calculate the area for every polygon.
     * @return The area of the polygon.
     */
    public double getArea(){
        int n = points.size();
        double area = 0.0;

        // Iterate through each vertex of the polygon
        for (int i = 0; i < n; i++) {
            // Get the current and next vertices
            Point current = points.get(i);
            Point next = points.get((i + 1) % n);

            // Add the cross product of the current and next vertices to the total area
            area += current.getX() * next.getY() - next.getX() * current.getY();
        }

        // Take the absolute value of the area and divide by 2 to get the final result
        area = Math.abs(area) * 0.5;

        return area;
    }

}
