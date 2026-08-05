package OOP.Abstraction;

public class Cat extends Animal{

    @Override
    public void makeSound(String name){
        walk();
        System.out.println("Name of the cat: " + name);
        System.out.println("meow");
    }
}       // walk'ı yazmamız için zorlamadı because it is not an abstract method