package OOP.Polymorphism;

public class neyi_neyle_referans_edebiliriz {

    // concrete class, concrete subclass ile
    class Animal{

    }
    class Dog extends Animal{

    }
    Animal animal1 = new Dog();
    Dog dog1 = new Dog();    // new Animal desek olmaz. animal her zaman dog değildir


    // abstract class, onu extends eden class ile
    abstract class Shape{
        abstract double area();
    }
    class Circle extends Shape{
        double r;
        @Override
        public double area(){
            return 3.14 * r * r;
        }
    }
    Shape s = new Circle();
    // Circle c = new Shape();  abstract class tan object initialize edilemez zaten

    // Interface, onu implement eden class ile
    interface Drawable{
        void draw();
    }
    class Circle1 implements Drawable{
        @Override
        public void draw(){
            System.out.println("ldsa");
        }
    }
    Drawable d = new Circle1();   // Circle1, drawable nin kurallarına uyar
}
