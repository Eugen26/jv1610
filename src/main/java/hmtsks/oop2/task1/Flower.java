
package hmtsks.oop2.task1;


public class Flower implements Comparable<Object>{
     int freshlevel;
     int price;
     int stemlength;
     String color;
     

    public Flower(int freshlevel,  int stemlength, String color) {
        this.freshlevel = freshlevel;
       
        this.stemlength = stemlength;
        this.color = color;
        
    }

    @Override
    public String toString() {
        return "Flower{" + "freshlevel=" + freshlevel + ",  stemlength=" + stemlength + ", color=" + color + '}';
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

    public int getFreshlevel() {
        return freshlevel;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Object o) {
        Flower temp = (Flower) o;
        if(this.freshlevel < temp.freshlevel){
            return -1;
        }else if(this.freshlevel < temp.freshlevel){
                return 1;
            }
        return 0;
        }
}


