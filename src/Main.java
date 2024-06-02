import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Object> circles = new ArrayList<Object>();

        Circle circle = new Circle(new Point(9, 8), 11);
        Circle circle2 = new Circle(new Point(2, 1), 3);
        ColoredCircle circle3 = new ColoredCircle(new Point(8, 9), 10, "green");
        ColoredCircle circle4 = new ColoredCircle(new Point(3, 20), 14, "red");

        circles.add(circle);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);

        for (Object c : circles) {
            if (c instanceof ColoredCircle) {

                ColoredCircle cc = (ColoredCircle) c;
                System.out.println("Circle is colored, color: " + cc.getColor());
                System.out.println(cc.getRadius());
                System.out.println(cc.getCenter());

            } else {
                Circle cc = (Circle) c;
                System.out.println("Circle is not colored");
                System.out.println(cc.getRadius());
                System.out.println(cc.getCenter());
            }

        }

        

    }

}