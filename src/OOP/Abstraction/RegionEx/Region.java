package OOP.Abstraction.RegionEx;

public abstract class Region {  // region abstract olmaya çok uygun bir class

    private int x;
    private int y;
    private int z;

    public Region(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void bringCoordinates(){
        System.out.println(x + " " + y + " " + z);
    }

    public abstract void execute();

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ() {
        return z;
    }
}
