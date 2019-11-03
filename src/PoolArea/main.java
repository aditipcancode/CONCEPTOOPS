package PoolArea;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Width of rectangle  =" + rectangle.getWidth());
        System.out.println("Length of rectangle  =" + rectangle.getLength());
        rectangle.setArea();
        System.out.println("Area of rectangle  =" + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Width of Cuboid  =" + cuboid.getWidth());
        System.out.println("Length of Cuboid  =" + cuboid.getLength());
        cuboid.setArea();
        System.out.println("Area of Cuboid  =" + cuboid.getArea());
        System.out.println("Height of Cuboid  =" + cuboid.getHeight());
        cuboid.setVolume();
        System.out.println("Volume of Cuboid  =" + cuboid.getVolume());

    }
}
