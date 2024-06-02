import geometry.Circle;
import geometry.Point;

public class Main {
    public static void main(String[] args){


        Point point = new Point(5,8);
        Circle circle = new Circle(point, 11);

        System.out.println(circle.calculatePerimeter());

    }

}