package hmtsks.oop2.task10.taxiStation.car;

/**
 *
 * @author Eugen
 */
public class Car implements Comparable<Object> {

    int price;
    double fuel;// fuel consuption
    int speed;// max speed

    @Override
    public String toString() {
        return "Car{" + "price=" + price + ", fuel=" + fuel + ", speed=" + speed + '}';
    }

    public Car(int price, double fuel, int speed) {
        this.price = price;
        this.fuel = fuel;
        this.speed = speed;
    }

    //<editor-fold defaultstate="collapsed" desc="getters & setters ">
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
//</editor-fold>

    @Override
    public int compareTo(Object o) {
        Car temp = (Car) o;
        if (this.fuel < temp.fuel) {
            return -1;
        } else {
            if (this.fuel < temp.fuel) {
                return 1;
            }
        }
        return 0;
    }

}
