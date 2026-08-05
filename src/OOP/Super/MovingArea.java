package OOP.Super;

public class MovingArea {
    private int xPoint;
    private int yPoint;
    private int zPoint;

    public MovingArea(){}

    public MovingArea(int xPoint, int yPoint, int zPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.zPoint = zPoint;
    }

    public void aaa(){  // öylesine yazdım. child class objectinin parent class methoduna erişebiliyor
        // olduğunu gözlemlemek için

    }
    public void bringCoordinates(){
        System.out.println("X: " + xPoint + "Y: " + yPoint + "Z:" + zPoint);
    }

    public int getxPoint(){
        return xPoint;
    }

    public int getyPoint(){
        return yPoint;
    }

    public int getzPoint(){
        return zPoint;
    }

}
