package PoolArea;
public class Rectangle {
    private double width;
    private double length;
    private double Area;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return Area;
    }

    public void setArea() {
        if(width<0 )
        {
          this.width=0;
        }
        if(length<0)
        {
         this.length=0;
        }

        Area = width*length;
        this.Area=Area;

    }
}
