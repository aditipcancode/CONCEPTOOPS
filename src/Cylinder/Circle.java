package Cylinder;

public class Circle {
    private double radius;
    private double area;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.area;
    }

    public void setRadius(double radius) {
           }

    public void setArea() {
        if (this.radius < 0) {
            this.radius = 0;

            //area = Math.PI * this.radius * this.radius;
            //this.area = area;
        }
        area = Math.PI * this.radius * this.radius;
        this.area = area;
    }
}
