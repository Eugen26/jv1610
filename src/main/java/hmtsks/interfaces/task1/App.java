
package hmtsks.interfaces.task1;


public class App{
    public static void main(String[] args) {
        Apple  apple  = new Apple (150, "red", "ripe", "good", false);
        Peal   peal   = new  Peal (120, "yellow", "unripe", "good", false);
        Banana banana = new Banana(100, "green", "unripe", "good", false);
        Orange orange = new Orange(180, "orange", "ripe", "bad", false);
        Potato potato = new Potato(80, "brown", "ripe", "bad", false);
        Carrot carrot = new Carrot(50, "orange", "ripe", "good", false);
        Celery celery = new Celery(90, "white", "unripe", "good", false);
        Onion  onion  = new Onion (75, "white", "ripe", "bad", false);
        
        System.out.println(apple.peell(apple));
        System.out.println(peal.peell(peal));
        System.out.println(banana.peell(banana));
        System.out.println(orange.peell(orange));
        System.out.println(potato.peell(potato));
        System.out.println(carrot.peell(carrot));
        System.out.println(celery.peell(celery));
        System.out.println(onion.peell(onion));
        
                
    }
    
}
