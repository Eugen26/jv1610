package hmtsks.oop2.task3.elapp;

/**
 *
 * @author Eugen
 */
public class Elapp implements Comparable<Object> {

    int power;
    boolean outlet;
    String color;
    int cordLength;

    public Elapp(int power, boolean outlet, String color, int cordLength) {
        this.power = power;
        this.outlet = outlet;
        this.color = color;
        this.cordLength = cordLength;
    }

    public int getPower() {
        return power;
    }

    public boolean isOutlet() {
        return outlet;
    }

    public String getColor() {
        return color;
    }

    public int getCordLength() {
        return cordLength;
    }

    @Override
    public String toString() {
        return "Elapp{" + "power=" + power + ", outlet=" + outlet + ", color=" + color + ", cordLength=" + cordLength + '}';
    }

    @Override
    public int compareTo(Object o) {
        Elapp temp = (Elapp) o;
        if (this.power < temp.power) {
            return -1;
        } else {
            if (this.power > temp.power) {
                return 1;
            }
            return 0;
        }
    }

}
