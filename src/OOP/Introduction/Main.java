package OOP.Introduction;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();

        house1.doorColor = "white";
        house1.windowShape = "circle";

        house2.windowShape = "rectangular";  // silersem Orange Blue null 2011 print eder
        // böyle değiştirmezsen default olan değerleri kullanır, eğer default değer yoksa null döner

        System.out.println(house1.doorColor + " " + house1.roofColor + " " + house1.windowShape + " " + house1.dateOfBuilt);
        System.out.println(house2.doorColor +  " " + house2.roofColor + " " + house2.windowShape + " " + house2.dateOfBuilt);

        Calculator calculator1 = new Calculator();
        calculator1.add(6,4);
        calculator1.add(2);
        System.out.println("The value at calculator1: " + calculator1.returnValue());

        Calculator calculator2 = new Calculator();
        calculator2.add(2);
        calculator2.add(4,5);
        System.out.println("The value at calculator2: " + calculator2.returnValue());
    }
}
