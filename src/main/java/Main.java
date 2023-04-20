public class Main {

    public static void main(String[] args){

        Point point1 = new Point(0,0);
        Point point2 = new Point(4,2);
        Point point3 = new Point(5,3);

        Triangle triangle = new Triangle(point2,point3,point1);
        System.out.println(triangle.getArea());

    }

}
