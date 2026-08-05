package OOP.Inheritance.MinecraftWipeout;

public class BlockDownUp extends MovingArea{

    public BlockDownUp(int x, int y, int z){
        super(x, y, z);
    }

    public void blocksDown(){
        System.out.println("Blocks down");
    }

    public void blocksUp(){
        System.out.println("Blocks up");
    }
}
