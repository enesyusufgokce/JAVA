package OOP.Encapsulation;

public class Car {
    private double speed;
    private double fraction;
    private double wind;
    // olay burda başlıyo. başka yerlerden erişeme, speed ile alakalı attribute için ayarlamaları Car içinde
    // ayarla ki "encapsulation olsun" diyor. speed i sadece o kapsülün içinde ayarlayabil,
    // kapsülün dışında speed i yöneteme, diyor. Mokoko olursun falan. bir field'ın varsa o field'ı class ın
    // içinde işle

    public Car(){
        speed = 0;
        fraction = 1;
        wind = 5;
    }

    public double getSpeed() {  // getter örneği. bu sadece okunur bir sistem, dışarıdan değiştirilemez
        return speed;
    }

    public void driveCar(int _speed){
        speed = _speed - fraction - wind;  // gel burda hallet abi
        System.out.println("The car is driving. The speed is: " + speed);
    }
}
