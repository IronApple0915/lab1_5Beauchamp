/**
 * Project: lab1_5Beauchamp
 * Purpose Details: Creates three motorcycles and prints their details.
 * Course: Java Programming
 * Author: Alex Beauchamp
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Main {

    public static void main(String[] args) {

        Manufacturer honda = new Manufacturer("Honda", "Japan");

        Manufacturer yamaha = new Manufacturer("Yamaha", "Japan");

        Manufacturer kawasaki = new Manufacturer("Kawasaki", "Japan");

        Engine engine1 = new Engine(471, 2, 47);
        Engine engine2 = new Engine(689, 2, 72);
        Engine engine3 = new Engine(649, 4, 67);

        Motorcycle motorcycle1 = new Motorcycle("CB500F", 2024, "Red", 6699.00, engine1, honda);

        Motorcycle motorcycle2 = new Motorcycle("MT-07", 2024, "Blue", 8199.00, engine2, yamaha);

        Motorcycle motorcycle3 = new Motorcycle("Ninja 650", 2024, "Green", 7899.00, engine3, kawasaki);

        printMotorcycle(motorcycle1);
        printMotorcycle(motorcycle2);
        printMotorcycle(motorcycle3);
    }

    public static void printMotorcycle(Motorcycle motorcycle) {
        System.out.println("==============================");
        System.out.println("MOTORCYCLE DETAILS");
        System.out.println("==============================");

        System.out.println("Manufacturer: " + motorcycle.getManufacturer().getName());

        System.out.println("Country Founded: " + motorcycle.getManufacturer().getCountryFounded());

        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Color: " + motorcycle.getColor());

        System.out.printf("Price: $%.2f%n", motorcycle.getPrice());

        System.out.println("Engine Displacement: " + motorcycle.getEngine().getDisplacementCc() + " cc");

        System.out.println("Cylinders: " + motorcycle.getEngine().getCylinderCount());

        System.out.println("Horsepower: " + motorcycle.getEngine().getHorsepower() + " hp");

        System.out.println();
    }
}