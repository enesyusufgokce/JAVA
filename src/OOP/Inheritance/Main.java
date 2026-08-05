package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Banana banana = new Banana();
        banana.shape = "circle";  // extend ettiğim için (inheritance) fruit un attributelerine erişebiliyoruz
        banana.color = "yellow";

        banana.eatBanana();
        banana.eat();

        Orange orange = new Orange();
        orange.shape = "circle";
        orange.color = "orange";

        orange.eatOrange();
    }
}
