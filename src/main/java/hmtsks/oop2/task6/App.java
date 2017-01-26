package hmtsks.oop2.task6;

import hmtsks.oop2.task6.necklace.Chain;
import hmtsks.oop2.task6.necklace.Maker;
import hmtsks.oop2.task6.stone.Stone;
import hmtsks.oop2.task6.stone.gem.Gem;
import hmtsks.oop2.task6.stone.gem.Ruby;
import hmtsks.oop2.task6.stone.gem.Saphire;
import hmtsks.oop2.task6.stone.semiprecious.Amber;
import hmtsks.oop2.task6.stone.semiprecious.Jade;
import hmtsks.oop2.task6.stone.semiprecious.Semiprecious;
import java.util.ArrayList;

/**
 *
 * @author Eugen
 */
public class App {

    public static void main(String[] args) {
        Gem gem1 = new Ruby(10, 12000, "gem", 1);
        Gem gem2 = new Saphire(4, 3000, "gem", 2);
        Gem gem3 = new Ruby(6, 10000, "gem", 1);
        Semiprecious semi1 = new Amber(8, 6000, "semi", 3);
        Semiprecious semi2 = new Jade(2, 1000, "semi", 2);

        ArrayList<Stone> stones = new ArrayList<>();
        stones.add(gem1);
        stones.add(gem2);
        stones.add(gem3);
        stones.add(semi1);
        stones.add(semi2);

        Maker necklace = new Chain(stones);
        System.out.println("Total weight = " + necklace.TotalWeight());
        System.out.println("Total price = " + necklace.TotalPrice());

        necklace.sortByValue();
        necklace.printSort();
        System.out.println(necklace.findStone(1, 2));
    }

}
