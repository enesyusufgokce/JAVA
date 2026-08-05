package OOP.Abstraction;

public abstract class Animal {

    public void walk(){  // non-abstract method yazabilirim tabii ki içine
        System.out.println("I walked");
    }
    // abstract methods cannot have body
    public abstract void makeSound(String name);  // animal'ı extend eden classları bu methodu kullanmaya
                                       //zorladık (cat, bunu implemente etmek zorunda) parametre falan alabilir
}
