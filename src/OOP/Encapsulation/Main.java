package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.driveCar(30);
        car1.driveCar(40);
        car1.driveCar(70);

        DrivingCarManager drivingCarManager = new DrivingCarManager();
        drivingCarManager.driveTheCar(car1);

        System.out.println(car1.getSpeed());
    }
}
