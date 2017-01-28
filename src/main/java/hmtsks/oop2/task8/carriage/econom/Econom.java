package hmtsks.oop2.task8.carriage.econom;

import hmtsks.oop2.task8.carriage.Carriage;

/**
 *
 * @author Eugen
 */
public abstract class Econom extends Carriage {

    public Econom(int capacity, int busyPlace, double baggage, int comfortLvl) {
        super(capacity, busyPlace, baggage, comfortLvl);
        comfortLvl = 3;
        capacity = 54;
    }

}
