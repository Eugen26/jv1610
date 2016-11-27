
package hmtsks.oop2.task1;


public class Stripe extends Accessory{
    String type;

    public Stripe(String type, int price, String color, int length) {
        super(price, color, length);
        this.type = type;
    }


}
