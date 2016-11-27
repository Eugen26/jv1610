
package hmtsks.oop2.task1;


public class Flower {
     String freshlevel;
     int price;
     int stemlength;
     String color;
     

    public Flower(String freshlevel, int price, int stemlength, String color) {
        this.freshlevel = freshlevel;
        this.price = price;
        this.stemlength = stemlength;
        this.color = color;
        
    }

    @Override
    public String toString() {
        return "Flower{" + "freshlevel=" + freshlevel + ", price=" + price + ", stemlength=" + stemlength + ", color=" + color + '}';
    }


  
    public int getStemlength() {
        return stemlength;
    }

    public void setStemlength(int stemlength) {
        this.stemlength = stemlength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFreshlevel() {
        return freshlevel;
    }

    public void setFreshlevel(String freshlevel) {
        this.freshlevel = freshlevel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
