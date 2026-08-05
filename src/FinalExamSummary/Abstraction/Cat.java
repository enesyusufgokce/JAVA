package FinalExamSummary.Abstraction;

public class Cat extends Animal{

    @Override
    public void makeSound(String name){
        walk();
        System.out.println("my name is Aslan");
        System.out.println("meow");
    }
}
