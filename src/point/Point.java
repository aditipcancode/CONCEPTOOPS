package point;

public class Point {
    private int x;
    private int y;
    int x1, x2;
    int y1, y2;
    double dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    private double Point;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance() {
        return dis;
    }

    public double distance(double x, double y) {

        return dis;
    }

    public double distance(Point x)
    {
        return this.Point;

    }

}
