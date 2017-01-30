package hmtsks.oop2.task8.carriage;

/**
 *
 * @author Eugen
 */
public class Carriage implements Comparable<Object> {

    public int capacity;
    public int busyPlace;
    public double baggage;
    public int comfortLvl;

    public Carriage(int capacity, int busyPlace, double baggage, int comfortLvl) {
        this.capacity = capacity;
        this.busyPlace = busyPlace;
        this.baggage = baggage;
        this.comfortLvl = comfortLvl;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBusyPlace() {
        return busyPlace;
    }

    public double getBaggage() {
        return baggage;
    }

    public int getComfortLvl() {
        return comfortLvl;
    }

    @Override
    public String toString() {
        return "Carriage{" + "capacity=" + capacity + ", busyPlace=" + busyPlace + ", baggage=" + baggage + ", comfortLvl=" + comfortLvl + '}';
    }

    @Override
    public int compareTo(Object o) {
        Carriage temp = (Carriage) o;
        if (this.comfortLvl < temp.comfortLvl) {
            return -1;
        } else if (this.comfortLvl > temp.comfortLvl) {
            return 1;
        }
        return 0;
    }

}
