public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Bmx", 2);
        Car car = new Car("BMW", 4);
        Truck truck = new Truck("Truck", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle,car,truck);

    }
}
