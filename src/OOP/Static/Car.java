package OOP.Static;

public class Car {

    String brand;
    int age;

    public Car(){
        Counter.staticCounter++;
    }
}
