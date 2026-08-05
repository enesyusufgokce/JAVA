package OOP.Constructor;

// constructor, bir object oluşturulduğunda otomatik olarak çalışan bir methoddur
// genelde fieldler in altına constructor(lar), altına da methodlar yazılır
// constructor doesn't return anything, not even void
// constructors can be overloaded. (kendi constructor ımızı yazınca jvm'in default constructorunu overload ederiz)
// parametreli, parametresiz, default constructors

public class Car {
    public String model;
    public int producingYear;    // = 1970; bu default olarak vereceğin değeri constructor da yaz diyolar

    public Car (String _model){ // constructor'lar, class adlarıyla aynı olmak zorundadır. (yapıcı method -- "method")
        System.out.println("Object Is Producing");  // private yaparsak constructor a erişemeyeceğimiz için
        model = _model;                             // nesne de türetemeyiz
        // producingYear = 1970;
    }

    public Car(String _model, int _producingYear){
        System.out.println("Object is Producing");
        model = _model;
        producingYear = _producingYear;
    }

    public void printCar(){
        System.out.println("Car model: " + model);
        System.out.println("Producing year: " + producingYear);
    }
}
/*
constructor olmadan manuel atama, constructor olmasaydı, her nesne oluşturduğunda şöyle amelelik yapman gerekirdi:
Araba araba1 = new Araba(); // Araba şu an var ama markası yok, yılı 0.
araba1.marka = "Tesla";
araba1.yil = 2024;

constructor varken
Araba araba1 = new Araba("Tesla", 2024); // Tek satırda bitti! çünkü zaten çonstructor un içinde

model = _model;
producingYear = _producingYear;

bu atamalar zaten yapılmış vaziyette. sen tek satırda parametreleri girince onları yerlerine yerleştiriyor
*/