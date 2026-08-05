package OOP.This.MultiArenaSystem;

public class ArenaInitializer {
    public String state;
    private Arena arena;

    public ArenaInitializer(Arena arena){
        state = "Waiting";
        this.arena = arena;  // now, arena starter knows its arena
    }
    public void startArena(){
        System.out.println("Arena is starting: " + arena.getName());
        state = "Starting";
        arena.setCanBeEntered(false);
    }
}
