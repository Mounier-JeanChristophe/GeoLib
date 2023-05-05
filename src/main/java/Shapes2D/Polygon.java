package Shapes2D;

import Vectors.Vector2;

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
    protected List<Vector2> vectors;

    /**
     * Constructor for creating a polygon.
     * @param vector2s Shapes2D.Points that composed the polygon.
     */
    public Polygon(Vector2... vector2s){
        this.vectors = new ArrayList<>();
        for(Vector2 vector2 : vector2s){
            this.vectors.add(vector2);
        }
    }

    /**
     * Calculate the perimeter for every polygon.
     * @return The perimeter of the polygon.
     */
    public double getPerimeter(){
        double perimeter = 0.0;
        int size = vectors.size();
        for(int i = 0; i < size-1; i++){
            perimeter += vectors.get(i).getDistance(vectors.get(i+1));
        }
        perimeter += vectors.get(size-1).getDistance(vectors.get(0));
        return perimeter;
    }

    /**
     * Calculate the area for every polygon.
     * @return The area of the polygon.
     */
    public double getArea(){
        int n = vectors.size();
        double area = 0.0;

        // Iterate through each vertex of the polygon
        for (int i = 0; i < n; i++) {
            // Get the current and next vertices
            Vector2 current = vectors.get(i);
            Vector2 next = vectors.get((i + 1) % n);

            // Add the cross product of the current and next vertices to the total area
            area += current.getX() * next.getY() - next.getX() * current.getY();
        }

        // Take the absolute value of the area and divide by 2 to get the final result
        area = Math.abs(area) * 0.5;

        return area;
    }

    public List<Vector2> getVectors() {
        return vectors;
    }
}
