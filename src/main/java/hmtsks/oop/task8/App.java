
package hmtsks.oop.task8;




import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        Car[] cars = new Car[11];
        cars[0] = new Car(1, "Bugatti", "Veyron", 2011, "red", 1000000, "0000");
        cars[1] = new Car(2, "Lamborgini", "Diablo", 2010, "yellow", 900000, "4554");
        cars[2] = new Car(3, "Opel", "Vectra", 2000, "grey", 9000, "1263");
        cars[3] = new Car(4, "Ferrari", "Testarossa", 1990, "red", 200000, "6666");
        cars[4] = new Car(5, "Ferrari", "F512M", 1994, "red", 350000, "3223");
        cars[5] = new Car(6, "Shkoda", "Fabia", 2004, "blue", 20000, "1123");
        cars[6] = new Car(7, "Daewoo", "Lanos", 2006, "black", 7000, "4761");
        cars[7] = new Car(8, "Nissan", "Skyline", 2009, "blue", 400000, "3333");
        cars[8] = new Car(9, "Bugatti", "Chiron", 2016, "blue", 2400000, "8888");
        cars[9] = new Car(10, "Bugatti", "Galibier", 2010, "silver", 1100000, "9999");
        cars[10] = new Car(11, "Bugatti", "Galibier", 2014, "darksilver", 1200000, "1001");
        
//        carMakeList(cars);
//        carModelList(cars);
        carYearList(cars);
//        Car[] cars2 = carMakeList(cars);
//        System.out.println(Arrays.toString(cars2));
    }
    
    //------------------------------------------------------------------------------
//    static Car[] carMakeList(Car[] cars){
//        Car[] cars2 = new Car[10];
//        System.out.println("Введите марку");
//        Scanner in = new Scanner(System.in);
//            String make = in.next();
//        for (Car car : cars) {
//            for (Car car1 : cars2) {
//                if(car.getMake().equals(make)){
//                car1 = car;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(cars2));
//        return cars2;
//        
//    }
//------------------------------------------------------------------------------
       static void carMakeList(Car[] cars){
       
        System.out.println("Введите марку");
        Scanner in = new Scanner(System.in);
            String make = in.next();
        for (Car car : cars) {
                if(car.getMake().equals(make)){
                    System.out.println(car);
                }
            
        }
        

    }
//------------------------------------------------------------------------------
       static void carModelList(Car[] cars){
            System.out.println("Введите модель");
        Scanner in = new Scanner(System.in);
            String model = in.next();
           System.out.println("Введите срок эксплуатации");
        Scanner in1 = new Scanner(System.in);
            int lifetime = in1.nextInt();
            
        for (Car car : cars) {
            int todaylt = 2016 - car.getYear();
                if(car.getModel().equals(model) && (todaylt > lifetime)){
                    System.out.println(car);
                }
            
            }
        }
//------------------------------------------------------------------------------
         static void carYearList(Car[] cars){
        System.out.println("Введите год");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Введите цену");
        Scanner in1 = new Scanner(System.in);
        int price = in1.nextInt();
             for (Car car : cars) {
                 if(car.getYear() == year && car.getPrice() > price){
                     System.out.println(car);
                 } 
             }
    
    }
//------------------------------------------------------------------------------
}
