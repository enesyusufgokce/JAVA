package OOP.AccessModifiers.Model;

public class ExtendsCar extends Car{
    public void blaa() {
        String a = model;     // we could reach them
        int b = releaseDate;
        // String c = brand; cannot be reached because brand is private. so it can only be
        // reached from the same class
        int d = rate;  // private olsa erişemezdi (şuan protected)
    }
}
