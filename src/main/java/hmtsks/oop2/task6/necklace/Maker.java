package hmtsks.oop2.task6.necklace;

import hmtsks.oop2.task6.stone.Stone;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Eugen
 */
public class Maker {

    ArrayList<Stone> stones;

    public Maker(ArrayList<Stone> stones) {
        this.stones = stones;
    }

    public int TotalWeight() {
        int totalWeight = 0;
        for (Stone stone : stones) {
            totalWeight += stone.getWeight();
        }
        return totalWeight;
    }

    public int TotalPrice() {
        int totalPrice = 0;
        for (Stone stone : stones) {
            totalPrice += stone.getPrice();
        }
        return totalPrice;
    }

    public ArrayList<Stone> findStone(int min, int max) {
        ArrayList<Stone> foundStones = new ArrayList<>();
        for (Stone stone : stones) {
            if (stone.getTransparency() >= min && stone.getTransparency() <= max) {
                foundStones.add(stone);
            }
        }
        return foundStones;
    }

    public void sortByValue() {
        Collections.sort(stones);
    }

    public void printSort() {
        for (Stone stone : stones) {
            System.out.println(stone);
        }
    }
}
