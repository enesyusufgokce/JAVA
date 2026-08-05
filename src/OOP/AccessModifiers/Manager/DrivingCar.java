package OOP.AccessModifiers.Manager;

import OOP.AccessModifiers.Model.Car;

public class DrivingCar extends Car {
    public void asdfkjl(){
        blabla();  // sadece blabla geldi, model and releaseDate gelmedi.the reason is blabla is public,
        // model and releaseDate are default
        int a = rate; // it is reachable because in different package and subclass
        // String f = model; model default old. için different package subclass a erişemedi. protected olsa
        // erişebilirdi ama. rate gibi

        // note: extend etmezsek object oluşturup öyle erişmeye çalışmamız gerekir
    }
}
