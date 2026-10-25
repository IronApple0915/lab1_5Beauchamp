/**
 * Project: lab1_5Beauchamp
 * Purpose Details: Represents a motorcycle manufacturer.
 * Course: Java Programming
 * Author: Alex Beauchamp
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Manufacturer {
    private String name;
    private String countryFounded;

    public Manufacturer(String name, String countryFounded) {
        this.name = name;
        this.countryFounded = countryFounded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryFounded() {
        return countryFounded;
    }

    public void setCountryFounded(String countryFounded) {
        this.countryFounded = countryFounded;
    }
}
