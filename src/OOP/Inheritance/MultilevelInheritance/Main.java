package OOP.Inheritance.MultilevelInheritance;

public class Main {
    public static void main(String[] args) {
        Banana banana = new Banana();
        banana.eatBanana();

        Orange orange = new Orange();
        orange.eatOrange();

        Apple apple = new Apple();
        apple.eatApple();
    }
}

// note: kalıtım alan class, parent class ın özelliklerine "super" keywordu ile erişebilir
// Kısacası this nasıl "bu sınıf" demekse, super de "üst sınıf" demek.
// Inheritance (kalıtım) yaparken ataya ulaşmanın yolu.