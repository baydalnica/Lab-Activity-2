
public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        Car car = new Car("Honda", "Civic", 2022, "Pink");
        Motorcycle motor = new Motorcycle("Yamaha", "Mio", 2023, 125);
        Truck truck = new Truck("Isuzu", "Elf", 2020, 5.5);
        Printer printer = new Printer();

        Serviceable[] serviceList = {car, motor, truck, printer};

        System.out.println("Service:");

        for (Serviceable s : serviceList) {
            performService(s);
        }

        System.out.println();

        Vehicle[] vehicleList = {car, motor, truck};

        System.out.println("Vehicle Details:");

        for (Vehicle v : vehicleList) {
            v.displayInfo();
            v.move();
            System.out.println();
        }
    }
}
