package OOP.Final;

// public final class Car {} dersek bu class extends edilemez. Audi class ı Car ı extend edemez yani kalıtamaz
public class Car {

    private final int age = 12;
    // static olsun istersek private static final int age = 12;   derdik
    // note: static iken, constructor her nesne oluşturulduğunda çağıldığı için tekrar tekrar değişken atamaya
    // çalıştığından dolayı constructor içinde değer ataması yapmak (age = 12; yi demek) hata fırlatır

    public Car(){
        // age = 12;   fieldda private final int age; deseydik age=12 atamasını yapabilirdik. ama şuan yapamıyoz
        // çünkü final a bir kere değer atanır, daha da değiştiremeyiz
        System.out.println("car constructor");
    }

    // public final void makeSelector dersek bunu override edemeyiz ve Audi class ında override method hata verir
    public void makeSelector(){  // if we want, we can make the parameter final
        // in there, we can not change tha final parameter
        System.out.println("biiipp");
    }
}
// note: static yapılar, extend ettiğimzide gelir, tıpkı non-static ler gibi