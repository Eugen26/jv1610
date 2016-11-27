
package hmtsks.oop.task10;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
     static void program(){
         Train[] trains = new Train[10];
         trains[0] = new Train("Kiev",    111, 20, 100, 50, 30,  20);
         trains[1] = new Train("Kherson", 234, 11, 90,  30, 30,  30);
         trains[2] = new Train("Lviv",    046, 23, 140, 80, 40,  20);
         trains[3] = new Train("Vinnitsa",145, 10, 0,  20, 30,  25);
         trains[4] = new Train("Donetsk", 341, 8,  120, 60, 40,  20);
         trains[5] = new Train("Moskow",  021, 1,  95,  30, 35,  30);
         trains[6] = new Train("Kiev",    192, 14, 0, 50, 50,  50);
         trains[7] = new Train("Lviv",    102, 21, 130, 50, 40,  40);
         trains[8] = new Train("Berlin",  991, 12, 100, 50, 30,  20);
         trains[9] = new Train("Kiev",    111, 13, 200, 80, 100, 20);
         
//         trainDestinationList(trains);
//         trainDestinationTimeList(trains);
         trainDestinationCommonList(trains);
     }
//------------------------------------------------------------------------------
    static void trainDestinationList(Train[] trains){
        System.out.println("Введите пункт назначения");
        Scanner in = new Scanner(System.in);
        String destination = in.next();
            for (Train train : trains) {
                if(train.getDestination().equals(destination)){
                    System.out.println(train);
                }
        }
    }
//------------------------------------------------------------------------------
    static void trainDestinationTimeList(Train[] trains){
        System.out.println("Введите пункт назначения");
        Scanner in = new Scanner(System.in);
        String destination = in.next();
         System.out.println("Введите время");
        Scanner in1 = new Scanner(System.in);
        int time = in1.nextInt();
            for (Train train : trains) {
                if(train.getDestination().equals(destination) && train.getTime() > time){
                    System.out.println(train);
                }
        }
    }
//------------------------------------------------------------------------------
    static void trainDestinationCommonList(Train[] trains){
        System.out.println("Введите пункт назначения");
        Scanner in = new Scanner(System.in);
        String destination = in.next();
            for (Train train : trains) {
                if(train.getDestination().equals(destination) && train.getCommon() > 0){
                    System.out.println(train);
                }
        }
    }
//------------------------------------------------------------------------------
}
