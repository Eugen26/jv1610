package hmtsks.oop2.task10;

import hmtsks.oop2.task10.taxiStation.TaxiStation;
import hmtsks.oop2.task10.taxiStation.car.Car;
import hmtsks.oop2.task10.taxiStation.car.daewoo.Lanos;
import hmtsks.oop2.task10.taxiStation.car.daewoo.Sens;
import hmtsks.oop2.task10.taxiStation.car.renault.Duster;
import hmtsks.oop2.task10.taxiStation.car.renault.Megane;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Duster(15000, 7.8, 220);
        Car car2 = new Duster(15000, 7.8, 220);
        Car car3 = new Megane(12000, 8.2, 200);
        Car car4 = new Lanos(8000, 6.5, 220);
        Car car5 = new Sens(7000, 6.5, 180);
        Car car6 = new Sens(15000, 7, 180);
        Car car7 = new Megane(12000, 7.8, 200);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        TaxiStation taxistation = new TaxiStation(cars);

        boolean exit = false;
        while (!exit) {
            printMainMenu();
            int choise = readUserChoise();
            if (choise > 4 || choise < 1) {
                break;
            }
            switch (choise) {
                case 1: {
                    System.out.println("total cost = " + taxistation.totalPrice());
                    System.out.println("");
                }
                break;
                case 2: {
                    taxistation.sort();
                    System.out.println("");
                    taxistation.printSort();
                    System.out.println("");
                }
                break;
                case 3: {
                    System.out.println("found cars = " + taxistation.searchCar());
                    System.out.println("");
                }
                break;
                default:
                    exit = true;
                    break;
            }
        }
    }

    //------------------------------------------------------------------------------
    static void printMainMenu() {
        System.out.println("Choose what you want to do");
        System.out.println("1.Count the total cost of ta[i station ");
        System.out.println("2.Sort cars by fuel consuption");
        System.out.println("3.Find a company car corresponding to "
                + "a given speed parameters ");
        System.out.println("Выход - любое другое число ");
    }
//------------------------------------------------------------------------------

    static int readUserChoise() {
        int choise = 0;
        while (true) {
            String s = scanner.next();
            try {
                choise = Integer.parseInt(s);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Not a number");
            }
        }
        return choise;
    }
//------------------------------------------------------------------------------

}
