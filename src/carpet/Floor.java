package carpet;

public class Floor {
    private double width;
    private double length;
    private double area;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double Area() {
        if ((length < 0) || (width < 0)) {
            this.length = 0;
            this.width = 0;
        }
        area = width * length;
        return this.area;
    }
}
