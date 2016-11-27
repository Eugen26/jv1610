
package hmtsks.oop2.task1;


public class Wrappping extends Accessory {
    String material;

    public Wrappping(String material, int price, String color, int length) {
        super(price, color, length);
        this.material = material;
    }

}
