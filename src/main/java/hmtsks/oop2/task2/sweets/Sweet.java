
package hmtsks.oop2.task2.sweets;


public class Sweet implements Comparable<Object>{
    protected int weight;
    int sugarContent;
    int nutritionalValue;
    int price;

    public Sweet( int sugarContent, int nutritionalValue, int price) {
        this.sugarContent = sugarContent;
        this.nutritionalValue = nutritionalValue;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet{" + "weight=" + weight + ", sugarContent=" + sugarContent + ", nutritionalValue=" + nutritionalValue + ", price=" + price + '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public int getNutritionalValue() {
        return nutritionalValue;
    }

    public int getPrice() {
        return price;
    }
    
        @Override
    public int compareTo(Object o) {
        Sweet temp = (Sweet) o;
        if(this.nutritionalValue < temp.nutritionalValue){
            return -1;
        }else if(this.nutritionalValue > temp.nutritionalValue){
                return 1;
            }
        return 0;
        }
}
