import Wall.Wall;

public class AreaWall {
    public static void main(String[] args) {


        Wall wall1 = new Wall();

        /*wall1.setWidth(-9.0);
        System.out.println(wall1.getWidth());
*/
        wall1.setWidth(9.0);
        System.out.println("WIDTH"+"="+wall1.getWidth());

        /*wall1.setHeight(-7.0);
        System.out.println(wall1.getHeight());*/

        wall1.setHeight(7.0);
        System.out.println("HEIGHT"+"="+wall1.getHeight());

        wall1.AreaWall();
        System.out.println("Area of wall"+"="+wall1.AreaWall());

        Wall area1=new Wall(8,8);
        System.out.println("AREA"+"="+area1.AreaWall());
    }
}
