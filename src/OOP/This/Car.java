package OOP.This;

// this, oluşturulan object in kendisini ifade eder
public class Car {
    private String name;
    private String model;

    public Car(String name, String model){
        this.name = name;  // this diyince parantezdeki name'i yine kendisine atamaya çalışmıyo (name = name'de
        this.model = model;  // öyleydi). bu kod bloğundan çıkıp field kısmındakine gidip değeri atıyor
        System.out.println(this);
    }
    public String getName(){
        return name;
    }
}
