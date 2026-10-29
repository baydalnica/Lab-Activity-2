
public class Truck extends Vehicle {

    private int tires;

    public Truck(String brand, String model, int year, int tires) {
        super(brand, model, year);
        this.tires = tires;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Information:");
        super.displayInfo();
        System.out.println("Number of Tires: " + tires);
    }

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A truck moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves right");
    }
}
