public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Volkswagen";
        vehicle1.model = "Beetle";
        vehicle1.year = 1975;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Fiat";
        vehicle2.model = "500";
        vehicle2.year = 2015;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Mini";
        vehicle3.model = "Cooper";
        vehicle3.year = 2023;

        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());
        System.out.println();

        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());
        System.out.println();

        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
    }
}