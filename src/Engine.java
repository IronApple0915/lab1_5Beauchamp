/**
 * Project: lab1_5Beauchamp
 * Purpose Details: Represents a motorcycle engine.
 * Course: Java Programming
 * Author: Alex Beauchamp
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Engine {
    private int displacementCc;
    private int cylinderCount;
    private int horsepower;

    public Engine(int displacementCc, int cylinderCount, int horsepower) {
        this.displacementCc = displacementCc;
        this.cylinderCount = cylinderCount;
        this.horsepower = horsepower;
    }

    public int getDisplacementCc() {
        return displacementCc;
    }

    public void setDisplacementCc(int displacementCc) {
        this.displacementCc = displacementCc;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
