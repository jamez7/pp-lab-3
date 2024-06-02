import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args){


        Point point = new Point(5,8);
        ColoredCircle circle = new ColoredCircle(point, 11, "green");
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle center: x= " + circle.getCenter().getX() + ", y= " + circle.getCenter().getY());


        System.out.println(circle.calculatePerimeter());

    }

}