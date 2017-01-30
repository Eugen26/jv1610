package hmtsks.oop2.task8.carriage.common;

import hmtsks.oop2.task8.carriage.Carriage;

/**
 *
 * @author Eugen
 */
public abstract class Common extends Carriage {

    public Common(int capacity, int busyPlace, double baggage) {
        super(capacity, busyPlace, baggage, 4);
    }

}
