
public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Information:");
        super.displayInfo();
    }

    @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A motorcycle moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves right");
    }
}
