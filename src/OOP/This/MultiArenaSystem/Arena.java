package OOP.This.MultiArenaSystem;

public class Arena {
    private boolean canBeEntered;  // for default, it is false
    private String name;
    private byte count;
    private ArenaInitializer arenaInitializer;

    public Arena(String name, byte count) {
        this.name = name;
        this.count = count;
        canBeEntered = true;
        arenaInitializer = new ArenaInitializer(this);  // now, arena knows its arena starter
    }
    public void Enter () {
        if (!canBeEntered){
            System.out.println(name + " is full, can not be entered");
            return;
        }
        System.out.println("Login to " + name + " is successful");
        count++;
        if (count == 2) {
            System.out.println(name + " is full");
            arenaInitializer.startArena();
        }
    }

    public void setCanBeEntered(boolean canBeEntered){
        this.canBeEntered = canBeEntered;
    }
    public String getName() {
        return name;
    }
}
