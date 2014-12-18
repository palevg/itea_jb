package itea.lsn5.Cars;

public class Engine {
    private double mileage;
    //private double volume;
    private double spend;
    private boolean started;

    public Engine(double vol, double mil) {
        this.mileage = mil;
        //this.volume = vol;
        this.spend = (vol - 1) * 5 + 4;
    }

    public double getMileage() {
        return mileage;
    }

/*    public double getVolume() {
        return volume;
    } */

    public double getSpend() {
        return spend;
    }

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }
}