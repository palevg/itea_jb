package itea.lsn5.Cars;

public class MyClass {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 1.6);
        Car ferrari = new Car("Ferrari", 5.0, 20000);

        bmw.turnOn();
        ferrari.turnOn();

        final int[] speeds = new int[] {20, 60, 100};

        for (int s : speeds)
            bmw.start(s, 0.5);
        for (int s : speeds)
            ferrari.start(s, 1);

        bmw.turnOff();
        ferrari.turnOff();

        System.out.println(bmw.getName() + " с пробегом " + bmw.getMileage() + " км, за последнюю поездку потрачено "
                + bmw.getSpendFuel() + " л топлива.");
        System.out.println(ferrari.getName() + " с пробегом " + ferrari.getMileage()
                + " км, за последнюю поездку потрачено " + ferrari.getSpendFuel() + " л топлива.");
    }
}