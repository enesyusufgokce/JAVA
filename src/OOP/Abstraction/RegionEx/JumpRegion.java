package OOP.Abstraction.RegionEx;

public class JumpRegion extends Region {

    public JumpRegion(int x, int y, int z){
        super(x, y, z);
    }

    @Override
    public void execute(){
        System.out.println("throw");
    }


}
