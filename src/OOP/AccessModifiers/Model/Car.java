package OOP.AccessModifiers.Model;

public class Car {

    String model;
    int releaseDate;
    private String brand;
    static protected int rate;
    public String color;

    public void blabla(){
        System.out.println(model);  // we can reach
        String a = brand; // can only be reached from the same class
    }
}
