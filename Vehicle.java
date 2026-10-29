
public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + this.brand +
                           ", Model: " + this.model +
                           ", Year: " + this.year);
    }

    public int calculateAge() {
        return 2026 - this.year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }

    public abstract void moveForward();

    public abstract void moveBackwards();

    public abstract void moveLeft();

    public abstract void moveRight();
}
