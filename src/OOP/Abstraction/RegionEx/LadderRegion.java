package OOP.Abstraction.RegionEx;

public class LadderRegion extends Region {

    public LadderRegion(int x, int y, int z){
        super(x, y, z);
    }

    @Override
    public void execute(){
        System.out.println("ladder used " +  getX() + getY());
    }
}
