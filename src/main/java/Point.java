public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(Point point){
        return Math.sqrt(Math.pow(point.getY()-y,2) + Math.pow(point.getX()-x,2));
    }

}
