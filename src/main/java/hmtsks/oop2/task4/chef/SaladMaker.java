
package hmtsks.oop2.task4.chef;

import hmtsks.oop2.task4.vegetables.Vegetable;
import java.util.ArrayList;
import java.util.Collections;


public class SaladMaker {
    private ArrayList<Vegetable> vegetables;

    public SaladMaker(ArrayList<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }
    
    public int totalCalorific(){
        int totalCalorific = 0;
            for (Vegetable vegetable : vegetables) {
                totalCalorific += vegetable.getCalorific();
        }
        return totalCalorific;
    }
//------------------------------------------------------------------------------
    public ArrayList<Vegetable> findVegetable(int mincal, int maxcal){
        ArrayList<Vegetable> foundVegetables = new ArrayList<Vegetable>();
        for (Vegetable vegetable : vegetables) {
            if(vegetable.getCalorific() > mincal && vegetable.getCalorific() < maxcal){
                foundVegetables.add(vegetable);
            }
        }
        return foundVegetables;
    }
//------------------------------------------------------------------------------
    public void sortByWeight(){
        Collections.sort(vegetables);
    }
//------------------------------------------------------------------------------
    public void printSort(){
        for (Vegetable vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
    
}
