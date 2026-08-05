package OOP.This.MultiArenaSystem;

public class Main {
    public static void main(String[] args) {
        Arena arena1 = new Arena("Arena1", (byte)0);
        arena1.Enter();
        arena1.Enter();
        arena1.Enter();

        System.out.println();

        Arena arena2 = new Arena("Arena2", (byte)0);
        arena2.Enter();

        System.out.println();

        Arena arena3 = new Arena("Arena3", (byte)0);
        arena3.Enter();
        arena3.Enter();
    }
}
