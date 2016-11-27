
package hmtsks.oop.task10;


public class Train {
    String destination;
    int number;
    int time;
    int common;
    int reserved;
    int compartment;
    int luxury;

    public Train(String destination, int number, int time, int common, int reserved, int compartment, int luxury) {
        this.destination = destination;
        this.number = number;
        this.time = time;
        this.common = common;
        this.reserved = reserved;
        this.compartment = compartment;
        this.luxury = luxury;
    }

    @Override
    public String toString() {
        return "Train{" + "destination=" + destination + ", number=" + number + ", time=" + time + ", common=" + common + ", reserved=" + reserved + ", compartment=" + compartment + ", luxury=" + luxury + '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCommon() {
        return common;
    }

    public void setCommon(int common) {
        this.common = common;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    public int getCompartment() {
        return compartment;
    }

    public void setCompartment(int compartment) {
        this.compartment = compartment;
    }

    public int getLuxury() {
        return luxury;
    }

    public void setLuxury(int luxury) {
        this.luxury = luxury;
    }
    
}
