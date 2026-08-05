package OOP.Inheritance.MinecraftWipeout;

public class Main {
    public static void main(String[] args) {
        BlockDownUp blockDownUp = new BlockDownUp(3,4,5);
        blockDownUp.xPoint = 1;
        blockDownUp.yPoint = 1;
        blockDownUp.zPoint = 1;
        blockDownUp.bringCoordinates();

        BlockFalling blockFalling = new BlockFalling(1,1,1);
        blockFalling.xPoint = 5;
        blockFalling.yPoint = 10;
        blockFalling.zPoint = 20;
        blockFalling.bringCoordinates();

        blockFalling.fallBlocks();
        blockDownUp.blocksDown();
    }
}