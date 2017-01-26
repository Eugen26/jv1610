package hmtsks.oop2.task3;

import hmtsks.oop2.task3.elapp.Elapp;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Eugen
 */
public class Owner {

    ArrayList<Elapp> apps;

    public Owner(ArrayList<Elapp> apps) {
        this.apps = apps;
    }

    public int powerCons() {
        int consuption = 0;
        for (Elapp app : apps) {
            if (app.isOutlet()) {
                consuption += app.getPower();
            }
        }

        return consuption;
    }
//------------------------------------------------------------------------------

    public ArrayList<Elapp> findApp(int min, int max) {
        ArrayList<Elapp> foundApp = new ArrayList<>();
        for (Elapp app : apps) {
            if (app.getCordLength() > min && app.getCordLength() < max) {
                foundApp.add(app);
            }
        }
        return foundApp;
    }
//------------------------------------------------------------------------------

    public void sortByPower() {
        Collections.sort(apps);
    }
//------------------------------------------------------------------------------

    public void printSort() {
        for (Elapp app : apps) {
            System.out.println(app);
        }
    }

}
