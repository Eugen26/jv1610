package hmtsks.oop2.task9.airline.plane;

/**
 *
 * @author Eugen
 */
public class Plane implements Comparable<Object> {

    protected int capacity;
    protected int load;
    protected int fuel;
    protected int range;

    public Plane(int capacity, int load, int fuel, int range) {
        this.capacity = capacity;
        this.load = load;
        this.fuel = fuel;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Plane{" + "capacity=" + capacity + ", load=" + load + ", fuel=" + fuel + ", range=" + range + '}';
    }

    //<editor-fold defaultstate="collapsed" desc="getters & setters">
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
//</editor-fold>

    @Override
    public int compareTo(Object o) {
        Plane temp = (Plane) o;
        if (this.range < temp.range) {
            return -1;
        } else {
            if (this.range > temp.range) {
                return 1;
            }
        }
        return 0;
    }
}
