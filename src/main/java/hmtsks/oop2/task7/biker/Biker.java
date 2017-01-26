package hmtsks.oop2.task7.biker;

import hmtsks.oop2.task7.amunition.Amunition;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Eugen
 */
public class Biker {

    ArrayList<Amunition> amunition;

    public Biker(ArrayList<Amunition> amunition) {
        this.amunition = amunition;
    }
//------------------------------------------------------------------------------

    public int totalCost() {
        int totalCost = 0;
        for (Amunition amunition1 : amunition) {
            totalCost += amunition1.getPrice();
        }
        return totalCost;
    }
//------------------------------------------------------------------------------

    public ArrayList<Amunition> searchAmu(int min, int max) {
        ArrayList<Amunition> found = new ArrayList<>();
        for (Amunition amunition1 : amunition) {
            if (amunition1.getPrice() >= min && amunition1.getPrice() <= max) {
                found.add(amunition1);
            }
        }
        return found;
    }
//------------------------------------------------------------------------------

    public void sort() {
        Collections.sort(amunition);
    }
//------------------------------------------------------------------------------

    public void printSort() {
        for (Amunition amunition1 : amunition) {
            System.out.println("After sorting by weight: " + amunition1);
        }
    }

}
