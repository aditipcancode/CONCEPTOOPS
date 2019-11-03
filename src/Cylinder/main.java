package Cylinder;


public class main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle radius = " + circle.getRadius());
        circle.setArea();
        System.out.println("Circle Area  =" + circle.getArea());


        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Radius of Cylinder   =" + cylinder.getRadius());
        System.out.println("Height of Cylinder   =" + cylinder.getHeight());
        cylinder.setArea();
        System.out.println("Area of Cylinder   =" + cylinder.getArea());
        cylinder.setVolumme();
        System.out.println("Volume of Cylinder   =" + cylinder.getVolume());
    }
}
