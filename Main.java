
public class Main {

    public static void main(String[] args) {

        Car car = new Car("Honda", "Civic", 2026);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "Fazzio", 2025);
        Truck truck = new Truck("Ford", "F-150", 2022, 6);

        Vehicle[] vehicles = {car, motorcycle, truck};

        for (Vehicle v : vehicles) {

            v.displayInfo();

            System.out.println("Age: " + v.calculateAge());
            System.out.println("Vintage: " + v.isVintage());

            v.moveForward();
            v.moveBackwards();
            v.moveLeft();
            v.moveRight();

            System.out.println();
        }
    }
}
