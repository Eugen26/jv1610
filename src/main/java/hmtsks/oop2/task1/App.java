
package hmtsks.oop2.task1;

import java.util.ArrayList;



public class App {
    public static void main(String[] args) {
        Rose rose1 = new Rose(1, 60, "red");
        Rose rose2 = new Rose(2, 70, "red");
        Rose rose3 = new Rose(3, 80, "white");
        Rose rose4 = new Rose(1, 80, "white");
        Lily lily1 = new Lily(1, 75, "yellow");
        Lily lily2 = new Lily(2, 75, "pink");
        Iris iris1 = new Iris(1, 65, "blue");
        
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(rose1);
        flowers.add(rose2);
        flowers.add(rose3);
        flowers.add(rose4);
        flowers.add(lily1);
        flowers.add(lily2);
        flowers.add(iris1);
        
        Accessory bouquet = new Stripe(flowers);

        System.out.println("total accessoryPrice of the bouquet: " + bouquet.totalPrice());
        
        bouquet.sortByFreshlevel();
        bouquet.printSort();
        System.out.println(bouquet.findFlowers(60, 75)); 
    }

}
