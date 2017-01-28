package hmtsks.oop2.task8.carriage.compartment;

import hmtsks.oop2.task8.carriage.Carriage;

/**
 *
 * @author Eugen
 */
public abstract class Compartment extends Carriage {

    public Compartment(int capacity, int busyPlace, double baggage, int comfortLvl) {
        super(capacity, busyPlace, baggage, comfortLvl);

    }

}
