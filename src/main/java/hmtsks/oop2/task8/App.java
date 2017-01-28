package hmtsks.oop2.task8;

import hmtsks.oop2.task8.carriage.Carriage;
import hmtsks.oop2.task8.carriage.common.Type1;
import hmtsks.oop2.task8.carriage.compartment.TGV;
import hmtsks.oop2.task8.carriage.luxury.Bachmann;
import hmtsks.oop2.task8.carriage.luxury.Norfolk;

/**
 *
 * @author Eugen
 */
public class App {

    public static void main(String[] args) {

        Carriage car1 = new Bachmann(0, 0, 0, 0);
        Carriage car2 = new Type1(0, 0, 0, 0);
        Carriage car3 = new Norfolk(0, 0, 0, 0);
        Carriage car4 = new TGV(0, 0, 0, 0);

    }

}
