package hmtsks.oop2.task10.taxiStation;

import hmtsks.oop2.task10.taxiStation.car.Car;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class TaxiStation {

    ArrayList<Car> cars;

    public TaxiStation(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    //------------------------------------------------------------------------------
    public int totalPrice() {
        int totalPrice = 0;
        for (Car car : cars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }

//------------------------------------------------------------------------------
    public ArrayList<Car> searchCar() {
        ArrayList<Car> foundCars = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter min speed");
        int min = in.nextInt();
        System.out.println("Enter max speed");
        int max = in.nextInt();
        for (Car car : cars) {
            if (car.getSpeed() >= min && car.getSpeed() <= max) {
                foundCars.add(car);
            }
        }
        return foundCars;
    }
//------------------------------------------------------------------------------

    public void sort() {
        Collections.sort(cars);
    }
//------------------------------------------------------------------------------

    public void printSort() {
        System.out.println("After sorting");
        for (Car car : cars) {
            System.out.println(car);
        }

    }

}
