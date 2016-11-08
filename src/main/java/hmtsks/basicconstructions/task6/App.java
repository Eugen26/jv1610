
package hmtsks.basicconstructions.task6;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        programm();
    }
//-----------------------------------------------------------------------
    static void programm(){
         int [][] array = {
            {0 },
            {0, 0},
            {0, 0, 0},
            {0 ,0, 0, 0},
            {0, 0, 0, 0 ,0}};
         boolean exit = false;
        while (!exit) {
            printMainMenu();
        int choise = readUserChoise();
            if(choise > 4 || choise < 1){
                break;
            }
        switch(choise){
            case 1:{
                printArray(array);
                    System.out.println("");
            }break;
            case 2:{
               horizontalReflection(array);
                    System.out.println("");
            }break;
            case 3:{
                verticalReflection(array);
                    System.out.println("");  
            }break;
            case 4:{
                horverReflection(array);
            }break;
            default : exit = true;
            break;
        }
    }
}
//-----------------------------------------------------------------------
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
//-----------------------------------------------------------------------
    static void printMainMenu(){
        System.out.println("Введите пункт меню");
        System.out.println("1.Напечатать исходный массив");
        System.out.println("2.Отразить массив по горизонтали");
        System.out.println("3.Отразить массив по вертикали");
        System.out.println("4.Отразить массив по горизонтали и вертикали");
        System.out.println("Выход - любое другое число ");
    }
//-----------------------------------------------------------------------
static void printArray(int[][] array){
        for(int [] x : array){
             for(int y : x){
                 System.out.print(y + " ");
             }
             System.out.println("");
         }
}
//-----------------------------------------------------------------------
        static void verticalReflection(int arr[][]){
         for(int i = arr.length-1; i >= 0; i--){
             for(int y : arr[i]){
                System.out.print(y + " ");
             }
            System.out.println();
         }
        }
//-----------------------------------------------------------------------
        static void horizontalReflection(int[][] array){
            for(int[] str : array){
                int spaceCount = array.length - str.length;
                for(int i = 0; i < spaceCount; i++){
                    System.out.print("  ");
                }
                for(int c : str){
                    System.out.print(c + " ");
                }
                System.out.println("");
            }
        }
//------------------------------------------------------------------------
         static void horverReflection(int[][] array){
           for(int i = array.length-1; i >= 0; i--){
               int spaceCount = array.length - array[i].length;
               for (int j = 0; j < spaceCount; j++) {
                   System.out.print("  ");
               }
               for (int y : array[i]) {
                   System.out.print(y + " ");
               }
               System.out.println("");
           }
         }

}
