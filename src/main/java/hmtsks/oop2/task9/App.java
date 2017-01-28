package hmtsks.oop2.task9;

import hmtsks.oop2.task9.airline.Airline;
import hmtsks.oop2.task9.airline.plane.Plane;
import hmtsks.oop2.task9.airline.plane.airbus.A300;
import hmtsks.oop2.task9.airline.plane.airbus.A350;
import hmtsks.oop2.task9.airline.plane.boeing.B717;
import hmtsks.oop2.task9.airline.plane.boeing.B777;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Plane> planes = new ArrayList<>();
        Plane plane1 = new A300(345, 135, 62, 7700);
        Plane plane2 = new A350(420, 265, 150, 15000);
        Plane plane3 = new B717(106, 54, 16, 3800);
        Plane plane4 = new B777(550, 352, 181, 14600);
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);
        planes.add(plane4);

        Airline airline = new Airline(planes);
        airline.setPlanes(planes);

        boolean exit = false;
        while (!exit) {
            printMainMenu();
            int choise = readUserChoise();
            if (choise > 4 || choise < 1) {
                break;
            }
            switch (choise) {
                case 1: {
                    System.out.println("total capacity = " + airline.totalCapacity());
                    System.out.println("1");
                }
                break;
                case 2: {
                    System.out.println("total load capacity = " + airline.totalLoad());
                    System.out.println("");
                }
                break;
                case 3: {
                    airline.sort();
                    System.out.println("");
                    airline.printSort();
                    System.out.println("");
                }
                break;
                case 4: {
                    System.out.println("found planes = " + airline.searchPlane());
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
        System.out.println("1.Count the total capacity ");
        System.out.println("2.Count the total load capacity");
        System.out.println("3.Sort company planes by range");
        System.out.println("4.Find a company plane corresponding to "
                + "a given range of fuel consumption parameters ");
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
