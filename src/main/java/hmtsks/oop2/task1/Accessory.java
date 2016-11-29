
package hmtsks.oop2.task1;

import java.util.ArrayList;
import java.util.Collections;


public class Accessory {
    int accessoryPrice;
    private final ArrayList<Flower> flowers;

    public Accessory(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

            public int totalPrice(){
                int totalPrice = 0;
                    for(Flower flower: flowers ){
                    totalPrice += flower.getPrice();
                }

                    totalPrice += this.getAccessoryPrice();
                return totalPrice;
            }
            
            public ArrayList<Flower> findFlowers(int minStemLength, int maxStemLength){
                ArrayList<Flower> foundFlowers = new ArrayList<>();
                    for(Flower flower : flowers){
                        if(flower.getStemlength() > minStemLength && flower.getStemlength() < maxStemLength){
                            foundFlowers.add(flower);
                        }
                    }
                    return foundFlowers;
            }
            
                public void sortByFreshlevel(){
                Collections.sort(flowers);
                }
                
                public void printSort(){
                    for (Flower flower : flowers) {
                        System.out.println(flower.getFreshlevel());
                    }
                }
            
    public int getAccessoryPrice() {
        return accessoryPrice;
    }



}
