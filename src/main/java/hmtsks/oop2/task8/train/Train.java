package hmtsks.oop2.task8.train;

import hmtsks.oop2.task8.carriage.Carriage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class Train {

    ArrayList<Carriage> carrieges;

    public Train(ArrayList<Carriage> carrieges) {
        this.carrieges = carrieges;
    }

//------------------------------------------------------------------------------
    public void printTrain() {
        for (Carriage carriege : carrieges) {
            System.out.println(carriege);
        }
    }

//------------------------------------------------------------------------------
    public int totalPass() {
        int totalPass = 0;
        for (Carriage carriege : carrieges) {
            totalPass += carriege.getBusyPlace();
        }
        return totalPass;
    }
//------------------------------------------------------------------------------

    public int totalBaggage() {
        int totalBag = 0;
        for (Carriage carriege : carrieges) {
            totalBag += carriege.getBaggage();
        }
        return totalBag;
    }
//------------------------------------------------------------------------------

    public ArrayList<Carriage> searchCar() {
        ArrayList<Carriage> foundCar = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose min number of passengers ");
        int min = in.nextInt();
        System.out.println("Choose max number of passengers ");
        int max = in.nextInt();
        for (Carriage carriege : carrieges) {
            if (carriege.getBusyPlace() >= min && carriege.getBusyPlace() <= max) {
                foundCar.add(carriege);
            }
        }
        return foundCar;
    }
//------------------------------------------------------------------------------

    public void sort() {
        Collections.sort(carrieges);
    }
//------------------------------------------------------------------------------

    public void printSort() {
        System.out.println("After sorting");
        for (Carriage carriege : carrieges) {
            System.out.println(carriege);
        }

    }

}
