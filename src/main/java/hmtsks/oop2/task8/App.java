package hmtsks.oop2.task8;

import hmtsks.oop2.task8.carriage.Carriage;
import hmtsks.oop2.task8.carriage.common.Type1;
import hmtsks.oop2.task8.carriage.common.Type2;
import hmtsks.oop2.task8.carriage.compartment.Civil;
import hmtsks.oop2.task8.carriage.compartment.TGV;
import hmtsks.oop2.task8.carriage.econom.Amtrak;
import hmtsks.oop2.task8.carriage.econom.TKS;
import hmtsks.oop2.task8.carriage.luxury.Bachmann;

import hmtsks.oop2.task8.carriage.luxury.Norfolk;
import hmtsks.oop2.task8.train.Train;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eugen
 */
public class App {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Carriage car1 = new Norfolk(12, 10);
        Carriage car2 = new Bachmann(10, 70);
        Carriage car3 = new Bachmann(8, 3);
        Carriage car4 = new Type1(56, 55);
        Carriage car5 = new Type2(12, 12);
        Carriage car6 = new Civil(30, 33);
        Carriage car7 = new TGV(22, 12);
        Carriage car8 = new Amtrak(20, 0);
        Carriage car9 = new TKS(25, 34);
        Carriage car10 = new Civil(12, 12);

        ArrayList<Carriage> carriages = new ArrayList<>();

        carriages.add(car1);
        carriages.add(car2);
        carriages.add(car3);
        carriages.add(car4);
        carriages.add(car5);
        carriages.add(car6);
        carriages.add(car7);
        carriages.add(car8);
        carriages.add(car9);
        carriages.add(car10);

        Train train = new Train(carriages);

        boolean exit = false;
        while (!exit) {
            printMainMenu();
            int choise = readUserChoise();
            if (choise > 5 || choise < 1) {
                break;
            }
            switch (choise) {
                case 1: {
                    train.printTrain();
                    System.out.println("");
                }
                break;
                case 2: {
                    System.out.println("total number passangers = " + train.totalPass());
                    System.out.println("");
                }
                break;
                case 3: {
                    System.out.println("total number of baggage = " + train.totalBaggage());
                    System.out.println("");
                }
                break;
                case 4: {
                    train.sort();
                    System.out.println("");
                    train.printSort();
                    System.out.println("");
                }
                break;
                case 5: {
                    System.out.println("found planes = " + train.searchCar());
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
        System.out.println("1.Print the train ");
        System.out.println("2.Count the total number passangers ");
        System.out.println("3.Count the total number of baggage ");
        System.out.println("4.Sort carrieges by comfort level");
        System.out.println("5.Find a company carrieges corresponding to "
                + "a given number of passangers ");
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
