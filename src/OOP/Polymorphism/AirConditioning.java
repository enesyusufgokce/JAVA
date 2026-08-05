package OOP.Polymorphism;

public class AirConditioning implements Heater, Cooler{

    @Override
    public void heat(){
        System.out.println("Air conditioning is heating");
    }

    @Override
    public void cool(){
        System.out.println("Air conditioning is cooling");
    }
}
