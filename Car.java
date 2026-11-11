
public class Car extends Vehicle implements Serviceable {

    private String color;

    public Car(String brand, String model, int year, String color) {
        super(brand, model, year, 4);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }

    @Override
    public void move() {
        System.out.println("The car travels smoothly along the highway.");
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}
