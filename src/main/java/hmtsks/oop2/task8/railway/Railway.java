/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmtsks.oop2.task8.railway;

import hmtsks.oop2.task8.carriage.Carriage;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class Railway {

    ArrayList<Carriage> carrieges;

    public Railway(ArrayList<Carriage> carrieges) {
        this.carrieges = carrieges;
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

    public ArrayList<Carriage> searchCar(int min, int max) {
        ArrayList<Carriage> foundCar = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose min number of passengers ");
        min = in.nextInt();
        System.out.println("Choose max number of passengers ");
        max = in.nextInt();
        for (Carriage carriege : carrieges) {
            if (carriege.getBusyPlace() >= min && carriege.getBusyPlace() <= max) {
                foundCar.add(carriege);
            }
        }
        return foundCar;
    }
//------------------------------------------------------------------------------

}
