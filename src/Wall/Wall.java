package Wall;

public class Wall {
    private double width;
    private double height;
    private double AreaWall;

    public Wall() {
        width = 0.0;
        height = 0.0;
    }

    public Wall(double height, double width) {
        if (height < 0) {
            this.height = 0.0;
        }
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        this.height = height;
    }


    public double setWidth(double width) {
        if (width < 0) {
            return this.width = 0.0;
        }
        return this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double setHeight(double height) {
        if (height < 0) {
            return this.height = 0.0;
        }
        return this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double AreaWall() {
        this.AreaWall = this.height * this.width;
        return this.AreaWall;
    }
}
