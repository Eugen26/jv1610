package hmtsks.oop2.task3;

import hmtsks.oop2.task3.elapp.Elapp;
import hmtsks.oop2.task3.elapp.large.Conditioner;
import hmtsks.oop2.task3.elapp.large.Fridge;
import hmtsks.oop2.task3.elapp.large.Large;
import hmtsks.oop2.task3.elapp.large.Washer;
import hmtsks.oop2.task3.elapp.small.Dryer;
import hmtsks.oop2.task3.elapp.small.Mixer;
import hmtsks.oop2.task3.elapp.small.Small;
import hmtsks.oop2.task3.elapp.small.Toster;
import java.util.ArrayList;

/**
 *
 * @author Eugen
 */
public class App {

    public static void main(String[] args) {
        Large app1 = new Fridge(200, true, "black", 3);
        Large app2 = new Conditioner(800, false, "white", 5);
        Large app3 = new Washer(2000, true, "grey", 2);
        Small app4 = new Mixer(500, false, "white", 1);
        Small app5 = new Toster(1100, false, "white", 2);
        Small app6 = new Dryer(1800, true, "white", 3);
        ArrayList<Elapp> apps = new ArrayList<>();
        apps.add(app1);
        apps.add(app2);
        apps.add(app3);
        apps.add(app4);
        apps.add(app5);
        apps.add(app6);

        Owner elApps = new House(apps);
        System.out.println("Cosuption power is " + elApps.powerCons());
        System.out.println("Find apps" + elApps.findApp(1, 3));
        elApps.sortByPower();
        elApps.printSort();
    }

}
