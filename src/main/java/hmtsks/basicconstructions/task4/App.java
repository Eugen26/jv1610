
package hmtsks.basicconstructions.task4;

import java.util.Arrays;
import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        programm();
    }
        static void printMainMenu(){
        System.out.println("Введите пункт меню");
        System.out.println("1.Вывести элементы массива в прямом порядке");
        System.out.println("2.Вывести элементы массива в обратном порядке");
        System.out.println("3.Вывести четные элементы массива");
        System.out.println("4.Вывести нечетные элементы массива");
        System.out.println("5.Сумма элементов кратных 7");
        System.out.println("6.Произведение элементов кратных 3");
        System.out.println("Выход - любое другое число ");
    }
        static void programm(){
        int[] array;
        array = new int[] {3, 11, 10, 14, 6, 50, 17, 8, 22, 10, 28};
        
        boolean exit = false;
        while (!exit) {
            printMainMenu();
        int choise = readUserChoise();
            if(choise > 6 || choise < 1){
                break;
            }
        switch(choise){
            case 1:{
                printdirectorder(array);
                    System.out.println("");
            }break;
            case 2:{
                printreverseorder(array);
                    System.out.println("");
            }break;
            case 3:{
                evenconc(array);
                    System.out.println("");  
            }break;
            case 4:{
                oddconc(array);
                    System.out.println("");
            }break;
            case 5:{
                smult(array);
                    System.out.println("");
            }break;
            case 6:{
                tproduct(array);
            }break;
            default : exit = true;
            break;
        }
    }

}
 
      static int readUserChoise(){
        int choise = 0;
            while(true){
                String s = scanner.next();
            try{
                choise = Integer.parseInt(s);
            break;
            }catch(NumberFormatException ex){
                System.out.println("Vvedeno ne chislo");
            }
        }
         return choise;
     }
        
      static void evenconc(int[] arr){
        System.out.println("Четные : ");
        for(int i =0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.print( arr[i] + " ");
            }
            
        }
      System.out.println();
      }
      
      static void oddconc(int[] arr){
           System.out.println("Нечетные : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                System.out.print( arr[i] + " ");
            }
        } 
        System.out.println();
      }
      
      static void smult(int[] arr){
           System.out.println(" Сумма кратных семи : ");
          int sum = 0;
          for(int i = 0; i < arr.length; i++){
             if(arr[i]%7 == 0){
                 sum += arr[i];
             }
        }
          System.out.println(sum);
          
      }
      
      
      static  void tproduct(int[] arr){
           System.out.println("Произведение кратных трем : ");
         int product = 1;
        for(int i =0; i<arr.length; i++){
             if(arr[i]%3 == 0){
                 product *= arr[i];
             }
        }
          System.out.println(product);
       
      }
      static  void printdirectorder(int[] arr){
             System.out.println("В прямом порядке : ");
             System.out.println( Arrays.toString(arr));
               
      }
      
      static  void printreverseorder(int[] arr){
          System.out.println("В обратном порядке : " );
        for(int i = (arr.length - 1); i >=0; i--){
            System.out.print( Arrays.asList(arr[i]) + " ");
        }
        System.out.println();
      }
}
