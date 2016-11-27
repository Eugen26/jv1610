
package hmtsks.oop.task11;



import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        Bus[] buses = new Bus[10];
        buses[0] = new Bus("Ivanov A. A.",    1122, 1,  "MAN",     2009, 60000);
        buses[1] = new Bus("Kozlov G. A.",    2222, 12, "Mersedes",2010, 45000);
        buses[2] = new Bus("Sidorov O. A.",   1422, 43, "Bogdan",  2011, 30000);
        buses[3] = new Bus("Petrov L. A.",    4422, 127,"Tata",    2005, 120000);
        buses[4] = new Bus("Girya K. S.",     7722, 11, "MAN",     2012, 60000);
        buses[5] = new Bus("Sergeev A. A.",   1199, 18, "MAN",     2007, 80000);
        buses[6] = new Bus("Vetrov Y. A.",    1100, 91, "Bogdan",  2003, 150000);
        buses[7] = new Bus("Pushkin W. W.",   1182, 12, "MAN",     2009, 90000);
        buses[8] = new Bus("Lenin F. I.",     1143, 71, "Tata",    2012, 20000);
        buses[9] = new Bus("Tapochkin T. A.", 5422, 1,  "MAN",     2009, 100000);
        
//        busRouteList(buses);
//        busLifetimeList(buses);
        busMileageList(buses);
    }
//------------------------------------------------------------------------------
    static void busRouteList(Bus[] buses){
        System.out.println("Введите номер маршрута");
        Scanner in = new Scanner(System.in);
        int route = in.nextInt();
            for (Bus bus : buses) {
                if(bus.getRoutenumber() == route){
                    System.out.println(bus);
                }
        }
    }
//------------------------------------------------------------------------------
    static void busLifetimeList(Bus[] buses){
               System.out.println("Введите срок эксплуатации * лет");
               Scanner in = new Scanner(System.in);
               int lifetime = in.nextInt();
                    for (Bus bus : buses) {
                    int todaylt = 2016 - bus.getYear();
                        if(todaylt > lifetime){
                            System.out.println(bus);
                        }
                    }
    }
//------------------------------------------------------------------------------
    static void busMileageList(Bus[] buses){
               System.out.println("Введите пробег(тыс. км)");
               Scanner in = new Scanner(System.in);
               int mileage = in.nextInt();
                    for (Bus bus : buses) {
                        if(bus.getMileage() > mileage){
                            System.out.println(bus);
                        }
                    }
    }
//------------------------------------------------------------------------------
}
