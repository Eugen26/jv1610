
package hmtsks.oop2.task2.presents;

import hmtsks.oop2.task2.sweets.Sweet;
import hmtsks.oop2.task2.sweets.candies.Candy;
import hmtsks.oop2.task2.sweets.candies.Chocolate;
import hmtsks.oop2.task2.sweets.candies.Lollipop;
import hmtsks.oop2.task2.sweets.cookies.Cake;
import hmtsks.oop2.task2.sweets.cookies.Cookie;
import hmtsks.oop2.task2.sweets.cookies.LemonPie;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        Candy candy1 = new Lollipop(10, 450, 5);
        Candy candy2 = new Lollipop(15, 500, 10);
        Candy candy3 = new Chocolate(20, 550, 20);
        Cookie cookie1 = new LemonPie(7, 450, 15);
        Cookie cookie2 = new Cake(20, 650, 25);
        Cookie cookie3 = new LemonPie(10, 450, 18);
        
        ArrayList<Sweet> sweets = new ArrayList<>();
        sweets.add(cookie3);
        sweets.add(cookie2);
        sweets.add(cookie1);
        sweets.add(candy1);
        sweets.add(candy2);
        sweets.add(candy3);
      
        PresentMaker present = new Pouch(sweets);
            System.out.println("Total weight of present" + present.totalWeight());
            present.sortByNutritionalValue();
            present.printSort();
            System.out.println(present.findSweets(10, 20 ).toString());
    }
}
