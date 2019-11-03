package PoolArea;

public class Cuboid extends Rectangle {

    private double height;
    private double Volume;
    private double Area;
    private double width;
    private double length;


    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.width=width;
        this.length=length;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getArea()
    {
        return Area;
    }

    public double getVolume() {
        return Volume;
    }

    public void setArea()
    {
      Area=width*length;
      this.Area=Area;
    }

    public void setVolume() {
        if(height<0)
        {
            height=0;
        }
        Volume = height * Area;
        this.Volume=Volume;
    }
}
