package hmtsks.oop2.task7;

import hmtsks.oop2.task7.amunition.Amunition;
import hmtsks.oop2.task7.amunition.bodyAmunition.Boots;
import hmtsks.oop2.task7.amunition.bodyAmunition.Overall;
import hmtsks.oop2.task7.amunition.headAmunition.Balaclava;
import hmtsks.oop2.task7.amunition.headAmunition.Helmet;
import hmtsks.oop2.task7.biker.Biker;
import hmtsks.oop2.task7.biker.Man;
import java.util.ArrayList;

/**
 *
 * @author Eugen
 */
public class App {

    public static void main(String[] args) {
        Amunition amu1 = new Helmet(3000, 700, "black");
        Amunition amu2 = new Balaclava(200, 100, "black");
        Amunition amu3 = new Overall(4000, 1500, "red");
        Amunition amu4 = new Boots(2000, 900, "grey");
        ArrayList<Amunition> amunitions = new ArrayList();
        amunitions.add(amu1);
        amunitions.add(amu2);
        amunitions.add(amu3);
        amunitions.add(amu4);

        Biker biker = new Man(amunitions);
        System.out.println("Total cost is " + biker.totalCost());
        biker.sort();
        biker.printSort();
        System.out.println("Found elements" + biker.searchAmu(3000, 5000));

    }
}
