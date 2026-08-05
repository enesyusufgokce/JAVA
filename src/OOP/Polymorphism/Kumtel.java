// method, operator ve nesnelerin birden fazla biçime sahip olması demektir
// + operatörünün hem toplama işlemi yapması, hem de stringleri birleştirmesi buna örnektir

// Car class ını extend eden audi nin Car audi1 = new Audi();   şeklinde örneklenmesi gibi

package OOP.Polymorphism;

public class Kumtel implements Heater, Cooler{
    @Override
    public void heat(){
        System.out.println("heating");
    }

    @Override
    public void cool(){
        System.out.println("cooling");
    }
}