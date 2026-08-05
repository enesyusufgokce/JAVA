package OOP.Inheritance.MinecraftWipeout;

public class BlockFalling extends MovingArea{

    private double slope;

    public BlockFalling(int x, int y, int z){
        super(x, y, z);  // accessing the constructor of the super class
    }
    public BlockFalling(int x, int y, int z, double slope){
        super(x, y, z);
        this.slope = slope;
    }
    @Override
    public void bringCoordinates(){
        super.bringCoordinates();
        System.out.println("Slope: " + slope);
    }

    public void fallBlocks(){
        System.out.println("Blocks are falling");
    }
}
