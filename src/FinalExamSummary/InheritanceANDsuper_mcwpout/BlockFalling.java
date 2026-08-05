package FinalExamSummary.InheritanceANDsuper_mcwpout;

public class BlockFalling extends MovingArea{

    private double slope;

    public BlockFalling(int x, int y, int z, double slope){
        super(x, y, z);
        this.slope = slope;
    }
    @Override
    public void bringCoordinates(){
        super.bringCoordinates();
        System.out.println("slope is: " + slope);
    }

    public void fallBlocks(){
        System.out.println("blocks are falling");
    }
}
