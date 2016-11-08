
package hmtsks.basicconstructions.task5;

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
        System.out.println("3.Для каждой четной строки вывести четные элементы массива");
        System.out.println("4.Для каждого нечетного столбца вывести нечетные элементы массива");
        System.out.println("5.Сумма элементов кратных 7 в четных строках");
        System.out.println("6.Произведение элементов кратных 3 в нечетных строках");
        System.out.println("Выход - любое другое число ");
    }
        static void programm(){
            

        System.out.println("source array");
        int[][] array2d = {
                            {4, 7,  2, 0,  5}, 
                            {11,23, 12,1,  9}, 
                            {1, 24, 32,14, 51},
                            {11,3,  6, 10, 22},
                            {90,27, 8, 17, 1},
                          };
        
         boolean exit = false;
        while (!exit) {
            printMainMenu();
        int choise = readUserChoise();
            if(choise > 6 || choise < 1){
                break;
            }
        switch(choise){
            case 1:{
                printdirectorder(array2d);
                    System.out.println("");
            }break;
            case 2:{
                printreverseorder(array2d);
                    System.out.println("");
            }break;
            case 3:{
                evenElements(array2d);
                    System.out.println("");  
            }break;
            case 4:{
                oddElements(array2d);
                    System.out.println("");
            }break;
            case 5:{
                smultsumm(array2d);
                    System.out.println("");
            }break;
            case 6:{
                mmultmult(array2d);
                    System.out.println("");
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
        
    static void printdirectorder(int[][] arr2){
        for (int[] arr21 : arr2) {
            for (int j = 0; j < arr21.length; j++) {
                System.out.print(arr21[j] + " ");
            }
            System.out.println("");
        }
             System.out.println("");
    } 
    
    static void printreverseorder(int[][] arr2){
         System.out.println("in reverse order");
             for (int i = arr2.length-1; i >= 0 ; i--){
                for(int j = arr2[i].length -1 ; j >= 0 ; j--){
            System.out.print(arr2[i][j] + " ");
                }
              System.out.println("");
             }
              System.out.println("");
    }
    
    static void evenElements(int[][] arr2){
         System.out.println("The even elements of the array for the even rows");
            for (int i = 0; i < arr2.length; i++){
                if (i%2 == 0){
                  for (int j = 0; j < arr2[i].length; j++){
                       if (arr2[i][j] % 2 == 0){
                           System.out.print(arr2[i][j] + " ");
                       }
                  }
                }
                
            }
            System.out.println("");
    }
    
    static void oddElements(int[][] arr2){
        System.out.println("Odd array elements for odd columns");
                for(int j = 0; j < arr2[0].length; j++){
            for (int[] arr21 : arr2) {
                if (j % 2 != 0) {
                    if (arr21[j] % 2 != 0) {
                        System.out.print(arr21[j] + " ");
                    }
                }
            }
                 }
                System.out.println("");
    }
    
    static void smultsumm(int[][] arr2){
        System.out.println("The summary of multiple 7 numbers for the even rows");
            int smult = 0;
            for (int i = 0; i < arr2.length; i++){
                if (i%2 == 0){
                    for (int j = 0; j < arr2[i].length; j++){
                       if (arr2[i][j] % 7 == 0){
                           smult += arr2[i][j];
                       }
                    }
                }
            } 
            System.out.println(smult);
    }
    static void mmultmult(int[][] arr2){
        System.out.println("The multiplication of multiple 3 numbers for the odd rows");
            int mmult = 1;
            for (int i = 0; i < arr2.length; i++){
                if (i%2 != 0){
                    for (int j = 0; j < arr2[i].length; j++){
                       if (arr2[i][j] % 3 == 0){
                           mmult *= arr2[i][j];
                       }
                    }
                }
            } 
            System.out.println(mmult);
    }
}
