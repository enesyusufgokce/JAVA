package FinalExamSummary.InheritanceANDsuper_mcwpout;

public class MovingArea {

    public int xPoint;
    public int yPoint;
    public int zPoint;

    public MovingArea(int xPoint, int yPoint, int zPoint){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.zPoint = zPoint;
    }
    public void bringCoordinates(){
        System.out.println("X: " + xPoint + " Y: " + yPoint + " Z: " + zPoint);
    }
}
