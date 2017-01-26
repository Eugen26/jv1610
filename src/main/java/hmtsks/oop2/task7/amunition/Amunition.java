package hmtsks.oop2.task7.amunition;

/**
 *
 * @author Eugen
 */
public class Amunition implements Comparable<Object> {

    int price;
    int weight;
    String color;

    public Amunition(int price, int weight, String color) {
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Amunition{" + "price=" + price + ", weight=" + weight + ", color=" + color + '}';
    }

    @Override
    public int compareTo(Object o) {
        Amunition temp = (Amunition) o;
        if (this.weight < temp.weight) {
            return -1;
        } else {
            if (this.weight > temp.weight) {
                return 1;
            }
        }
        return 0;

    }

}
