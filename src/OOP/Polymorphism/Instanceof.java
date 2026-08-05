package OOP.Polymorphism;

public class Instanceof {
    public static void main(String[] args) {
        Kumtel kumtel = new Kumtel();
        Stove stove = new Stove();

        boolean isHeater = kumtel instanceof Heater;
        boolean isCooler = stove instanceof Cooler;

        System.out.println(isCooler);
        System.out.println(isHeater);

        Heater heater  = new Kumtel();
        boolean isKumtel = heater instanceof Kumtel;
        System.out.println(isKumtel);
    }
}
