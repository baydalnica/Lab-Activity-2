
public class Motorcycle extends Vehicle implements Serviceable {

    private int engineCC;

    public Motorcycle(String brand, String model, int year, int engineCC) {
        super(brand, model, year, 2);
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine: " + engineCC + " CC");
    }

    @Override
    public void move() {
        System.out.println("The motorcycle rides through the city streets.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }
}
