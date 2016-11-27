
package hmtsks.oop.task12;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        Airline [] airlines = new  Airline[10];
            airlines[0] = new Airline("Kiev",   121, "Boeing", 13, "Monday");
            airlines[1] = new Airline("Kiev",   754, "Airbus", 20, "Wednesday");
            airlines[2] = new Airline("London", 334, "Boeing", 4, "Sunday");
            airlines[3] = new Airline("Paris",  887, "IL",     13, "Monday");
            airlines[4] = new Airline("London", 231, "Boeing", 18, "Wednesday");
            airlines[5] = new Airline("Kiev",   901, "IL",     11, "Monday");
            airlines[6] = new Airline("Berlin", 102, "Boeing", 3, "Monday");
            airlines[7] = new Airline("Berlin", 544, "Airbus", 19, "Tuesday");
            airlines[8] = new Airline("Kiev",   986, "Airbus", 21, "Wednesday");
            airlines[9] = new Airline("Paris",  129, "IL",     12, "Saturday");
            
            airDestinationList(airlines);
            airDayList(airlines);
            airDayTimeList(airlines);
    }
//------------------------------------------------------------------------------
        static void airDestinationList(Airline [] airlines){
        System.out.println("Введите пункт назначения");
        Scanner in = new Scanner(System.in);
            String dest = in.next();
           for (Airline airline : airlines) {
               if(airline.getDestination().equals(dest)){
                   System.out.println(airline);
               }
           }
        }
//------------------------------------------------------------------------------
        static void airDayList(Airline [] airlines){
        System.out.println("Введите день недели");
        Scanner in = new Scanner(System.in);
            String day = in.next();
           for (Airline airline : airlines) {
               if(airline.getDay().equals(day)){
                   System.out.println(airline);
               }
           }
        }
//------------------------------------------------------------------------------
        static void airDayTimeList(Airline [] airlines){
        System.out.println("Введите день недели");
        Scanner in = new Scanner(System.in);
            String day = in.next();
        System.out.println("Введите время");
        Scanner in1 = new Scanner(System.in);
            int time = in1.nextInt();
           for (Airline airline : airlines) {
               if(airline.getDay().equals(day) && airline.getTime() > time){
                   System.out.println(airline);
               }
           }
        }
//------------------------------------------------------------------------------
}
