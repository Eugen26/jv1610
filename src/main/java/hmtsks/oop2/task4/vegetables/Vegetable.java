
package hmtsks.oop2.task4.vegetables;


public class Vegetable implements Comparable<Object>{
    int weight;
    protected int calorific;
    int price;

    public Vegetable(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vegetable{" + "weight=" + weight + ", calorific=" + calorific + ", price=" + price + '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getCalorific() {
        return calorific;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        Vegetable temp = (Vegetable) o;
        if(this.weight < temp.weight){
            return -1;
        }else if(this.weight > temp.weight){
            return 1;
        }
        return 0;
    }
    
    
}
