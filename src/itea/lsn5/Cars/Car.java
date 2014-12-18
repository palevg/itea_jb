package itea.lsn5.Cars;

public class Car {
    private String name;
    private Engine engine; // мотор
    private Climate climate = new Climate(); // климат-контроль
    private double spendFuel;

    public Car(String name, double volume) {
        this.name = name;
        engine = new Engine(volume, 0);
    }

    public Car(String name, double volume, double mileage) {
        this.name = name;
        engine = new Engine(volume, mileage);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

    public double getSpendFuel() {
        return spendFuel;
    }

    // завести мотор
    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
        spendFuel = 0;
    }

    // заглушить мотор
    public void turnOff() {
        climate.turnOff();
        engine.turnOff();
    }

    // установить скорость
    public void start(int speed, double hours) {
        if (engine.isStarted()) { // еще не заведен мотор
            // пройденная дистанция
            double distance = hours * speed;
            engine.addMileage(distance);
            spendFuel += (distance * engine.getSpend()) / 100;
        }
    }
}