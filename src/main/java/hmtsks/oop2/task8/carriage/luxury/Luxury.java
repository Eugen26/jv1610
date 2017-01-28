package hmtsks.oop2.task8.carriage.luxury;

import hmtsks.oop2.task8.carriage.Carriage;

/**
 *
 * @author Eugen
 */
public abstract class Luxury extends Carriage {

    public Luxury(int capacity, int busyPlace, double baggage, int comfortLvl) {
        super(capacity, busyPlace, baggage, comfortLvl);
        comfortLvl = 1;
    }

}
