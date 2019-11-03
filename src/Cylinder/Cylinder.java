package Cylinder;

public class Cylinder extends Circle {
    private double height;
    private double Volume;

    public Cylinder(double radius, double height) {
        super(radius);

        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Volume;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public void setVolumme() {
        if (height < 0) {
            height = 0;


        }
        Volume = getArea() * height;
        this.Volume=Volume;
    }


}
