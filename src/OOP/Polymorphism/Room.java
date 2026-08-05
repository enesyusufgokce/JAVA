package OOP.Polymorphism;

public class Room {
    private double temperature;

    public void heatRoom(Heater heater){
        heater.heat();
    }
    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
}
