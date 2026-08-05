// subclass, superclass
// "is a" relationship
// note: one class can extend just one class

package OOP.Inheritance;

public class Fruit {
    public String color;
    public String shape;

    // we move the eat method from the banana and orange classes to here (because every fruit can be eaten)
    public void eat(){
        System.out.println("color: " + color + " " + "shape: " + shape);
    }
}
