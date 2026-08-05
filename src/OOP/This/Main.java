package OOP.This;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Toyota", "corolla"); // constructor çalışınca (this var) -> OOP.This.Car@72ea2f77
        Car c2 = new Car("audi", "A5");

        System.out.println("C1: " + c1); // bu çalışınca -> A1: OOP.This.Car@72ea2f77 (yukarı bakarsan aynı object'ler)
        System.out.println("C2: " + c2);
        System.out.println(c1.getName());
    }
}
