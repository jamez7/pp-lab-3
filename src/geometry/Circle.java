package geometry;

public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {

        return center;
    }
    public void setCenter() {

        this.center = center;
    }


    public double getRadius() {

        return radius;
    }
    public void setRadius() {

        this.radius = radius;
    }

    public double calculatePerimeter() {


        return (Math.PI * 2 * this.radius);
    }

    public double getArea() {

        return Math.PI * this.radius * this.radius;

    }


}
