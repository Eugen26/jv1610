
package hmtsks.oop2.task2.presents;

import hmtsks.oop2.task2.sweets.Sweet;
import java.util.ArrayList;
import java.util.Collections;


public class PresentMaker {
    private ArrayList<Sweet> sweets;

    public PresentMaker(ArrayList<Sweet> sweets) {
        this.sweets = sweets;
    }
    
    public int totalWeight(){
        int totalWeight = 0;
            for (Sweet sweet : sweets) {
                totalWeight += sweet.getWeight();
            
        }
        return totalWeight;
    }
    
    public ArrayList<Sweet> findSweets(int minSugarContent, int maxSugarContent){
        ArrayList<Sweet> foundSweets = new ArrayList<>();
            for (Sweet sweet : sweets) {
                if(sweet.getSugarContent() > minSugarContent && sweet.getSugarContent() < maxSugarContent){
                    foundSweets.add(sweet);
                }
            }
        return foundSweets;
    }
    
    public void sortByNutritionalValue(){
        Collections.sort(sweets);
    }
    
    public void printSort(){
        for (Sweet sweet : sweets) {
            System.out.println(sweet);
        }
    }


}
