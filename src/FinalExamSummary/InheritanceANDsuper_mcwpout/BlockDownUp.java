package FinalExamSummary.InheritanceANDsuper_mcwpout;

public class BlockDownUp extends MovingArea{

    public BlockDownUp(int x, int y, int z){
        super(x, y, z);
    }

    public void blocksDown(){
        System.out.println("Blocks Down" + yPoint);
    }

    public void blocksUp(){
        System.out.println("Blocks Up");
    }
}
