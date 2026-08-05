package OOP.Inheritance.MultilevelInheritance;

public class PeelableFruit extends Fruit {
    public void peelFirst() {
        System.out.println("The fruit is peeling");
        eat();
    }
}
