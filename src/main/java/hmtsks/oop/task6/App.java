//int id, int number, int area, int floor, int rooms, String street, String type, int lifetime
package hmtsks.oop.task6;



import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        House[] flats = new House[10];
        flats[0] = new House(1, 1, 45, 1, 2, "Науки", "Жилое", 50);
        flats[1] = new House(2, 11, 25, 10, 1, "Сумская", "Жилое", 60);
        flats[2] = new House(3, 43, 82, 3, 3, "Степана Бандеры", "Жилое", 40);
        flats[3] = new House(4, 24, 70, 4, 3, "Молочная", "Жилое", 50);
        flats[4] = new House(5, 2, 120, 13, 4, "Яблочная", "Жилое", 60);
        flats[5] = new House(6, 98, 28, 6, 1, "Героев", "Жилое", 55);
        flats[6] = new House(7, 122, 55, 9, 2, "Войны", "Жилое", 50);
        flats[7] = new House(8, 75, 26, 7, 1, "Мира", "Жилое", 40);
        flats[8] = new House(9, 18, 63, 14, 2, "Пупкина", "Жилое", 45);
        flats[9] = new House(10, 9, 155, 1, 6, "Пушкина", "Жилое", 50);
        
        flatList(flats);
        flatSearch(flats);
        flatAreaList(flats);
    }
    
    //--------------------------------------------------------------------------
    static void flatList(House[] flats){
        System.out.println("Введите кол-во комнат");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
           for (House flat : flats) {
            if(flat.getRooms() == number){
               System.out.println(flat);
                }
           }
    
    }
//------------------------------------------------------------------------------
          static void flatSearch(House[] flats){
              System.out.println("Введите кол-во комнат");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("Введите минимальный этаж");
        Scanner in1 = new Scanner(System.in);
        int min = in1.nextInt();
        System.out.println("Введите максимальный этаж");
        int max = in1.nextInt();
              for (House flat : flats) {
                  if (flat.getRooms() == number && flat.getFloor() > min && flat.getFloor() < max) {
                      System.out.println(flat);
                  }
              }
    }
//------------------------------------------------------------------------------
          static void flatAreaList(House[] flats){
        System.out.println("Введите площадь");
        Scanner in = new Scanner(System.in);
        int area = in.nextInt();
           for (House flat : flats) {
            if(flat.getArea()> area){
               System.out.println(flat);
                }
           }
    
    }
//------------------------------------------------------------------------------
}
