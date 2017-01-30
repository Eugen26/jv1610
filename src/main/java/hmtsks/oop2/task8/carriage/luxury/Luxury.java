package hmtsks.oop2.task8.carriage.luxury;

import hmtsks.oop2.task8.carriage.Carriage;

/**
 *
 * @author Eugen
 */
public abstract class Luxury extends Carriage {

    public Luxury(int capacity, int busyPlace, double baggage) {
        super(capacity, busyPlace, baggage, 1);

    }

}
