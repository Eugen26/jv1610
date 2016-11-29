
package hmtsks.oop2.task4;

import hmtsks.oop2.task4.chef.Bowl;
import hmtsks.oop2.task4.chef.SaladMaker;
import hmtsks.oop2.task4.vegetables.Vegetable;
import hmtsks.oop2.task4.vegetables.legumes.Bean;
import hmtsks.oop2.task4.vegetables.legumes.Legumes;
import hmtsks.oop2.task4.vegetables.legumes.Peas;
import hmtsks.oop2.task4.vegetables.pumpkin.Cucumber;
import hmtsks.oop2.task4.vegetables.pumpkin.Marrow;
import hmtsks.oop2.task4.vegetables.pumpkin.Pumpkin;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        Legumes legumes1 = new Bean(200, 50);
        Legumes legumes2 = new Peas(100, 25);
        Pumpkin pumpkin1 = new Marrow(150, 10);
        Pumpkin pumpkin2 = new Cucumber(300, 13);
        ArrayList<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(legumes1);
        vegetables.add(legumes2);
        vegetables.add(pumpkin1);
        vegetables.add(pumpkin2);
        vegetables.add(pumpkin1);
        
        SaladMaker salad = new Bowl(vegetables);
        System.out.println("Total calorific = " + salad.totalCalorific());
        salad.sortByWeight();
        salad.printSort();
        System.out.println(salad.findVegetable(100, 350).toString());
    }
    
}
