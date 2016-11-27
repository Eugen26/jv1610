
package hmtsks.oop2.task1;


public class Accessory {
    int price;
    String color;
    int length;

    public Accessory(int price, String color, int length) {
        this.price = price;
        this.color = color;
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Accessory{" + "price=" + price + ", color=" + color + ", length=" + length + '}';
    }
    


}
