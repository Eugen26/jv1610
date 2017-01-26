package hmtsks.oop2.task6.stone;

/**
 *
 * @author Eugen
 */
public class Stone implements Comparable<Object> {

    int weight;
    int price;
    String value;
    int transparency;//transparency level(from 1 to 3, where 1 - transparency, 2 - translucent, 3 - opaque)

    public Stone(int weight, int price, String value, int transparency) {
        this.weight = weight;
        this.price = price;
        this.value = value;
        this.transparency = transparency;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public String getValue() {
        return value;
    }

    public int getTransparency() {
        return transparency;
    }

    @Override
    public String toString() {
        return "Stone{" + "weight=" + weight + ", price=" + price + ", value=" + value + ", transparency=" + transparency + '}';
    }

    @Override
    public int compareTo(Object o) {
        Stone temp = (Stone) o;
        return (this.value.compareTo(temp.value));
    }

}
