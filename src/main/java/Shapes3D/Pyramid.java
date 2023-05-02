package Shapes3D;

import Shapes2D.Square;
import Vectors.Vector3;

public class Pyramid implements IShape {

    private Square base;

    private double height;

    public Pyramid(Square base,double height){
        this.base = base;
        this.height = height;
    }

    public Pyramid(Square base, Vector3 vector){
        this.base = base;
        this.height = findHeight();
    }

    public double findHeight() {
        double baseDiagonal = baseSideLength * Math.sqrt(2);
        double apexDiagonal = baseDiagonal / 2;
        return Math.sqrt(apexDiagonal * apexDiagonal - (baseDiagonal / 2) * (baseDiagonal / 2));
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
