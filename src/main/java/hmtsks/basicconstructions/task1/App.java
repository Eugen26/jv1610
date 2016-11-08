
package hmtsks.basicconstructions.task1;

import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        programm();
    }

    static void programm(){
        int[] array = new int[101];
        System.out.println("Исходный массив: ");
        
            for(int i = 0; i < 101; i++){
                array[i] = i;
            }
            for(int x : array){
            System.out.print( x + " ");
            }
            System.out.println();

 //---------------------------------------------------------------------   
            System.out.println(" Массив кратных 2: ");
                int sum2 = 0;
                    for(int i = 0; i < array.length; i++){
                         if(array[i]% 2 == 0){
                        System.out.print(array[i] + " ");
                        sum2 = sum2 + array[i];     
                        }
                    }
            System.out.println();
            System.out.println("Сумма кратных 2: " + sum2);
            System.out.println();
////------------------------------------------------------------------------------ 
            System.out.println(" Массив кратных 3: ");
            int sum3 = 0;            
                for(int i = 0; i < array.length; i++){
                    if(array[i]% 3 == 0){
                    System.out.print(array[i] + " ");
                     sum3 = sum3 + array[i];
                    }
                }

            System.out.println();
            System.out.print("Сумма кратных 3: " + sum3);
            System.out.println();

//------------------------------------------------------------------------------
            System.out.println(" Массив кратных 5: ");
                int sum5 = 0;
                    for(int i = 0; i < array.length; i++){
                        if(array[i]% 5 == 0){
                        System.out.print(array[i] + " ");
                         sum5 = sum5 + array[i];
                        }
                    }
                    System.out.println();
                    System.out.println("Сумма кратных 5: " + sum5);
                    System.out.println();
//------------------------------------------------------------------------------
            System.out.println(" Массив кратных 7: ");
                int sum7 = 0;
                    for(int i = 0; i < array.length; i++){
                         if(array[i]% 7 == 0){
                            System.out.print(array[i] + " ");
                            sum7 = sum7 + array[i];
                        }
                    }
                    System.out.println();
                    System.out.print("Сумма кратных 7: " + sum7);
                    System.out.println();
//------------------------------------------------------------------------------                    
                    int diff72 = sum7 - sum2;
                    System.out.println("Разность сумм кратных 7 и 2: " + diff72);
//------------------------------------------------------------------------------
                    int div53 = sum5 / sum3;
                    System.out.println("Отношение сумм кратных 5 к 3: "+ div53);
    }
}
