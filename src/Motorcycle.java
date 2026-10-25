/**
 * Project: lab1_5Beauchamp
 * Purpose Details: Represents a motorcycle and its properties.
 * Course: Java Programming
 * Author: Alex Beauchamp
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Motorcycle {
    private String model;
    private int year;
    private String color;
    private double price;
    private Engine engine;
    private Manufacturer manufacturer;

    public Motorcycle(String model, int year, String color, double price, Engine engine, Manufacturer manufacturer) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
