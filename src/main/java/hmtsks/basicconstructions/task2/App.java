
package hmtsks.basicconstructions.task2;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Введите целое число от 0 до 99");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
         if(num == 0 || num == 10 ||num == 11 ||num == 12 ||num == 13 ||num == 14 ||num == 15 ||num == 16 ||num == 17 ||num == 18 ||num == 19){
     //особые случаи           
           if(num == 0)
            System.out.println("ноль");
                if(num == 10)
            System.out.println("десять");
                if(num == 11)
            System.out.println("одиннадцать");
                if(num == 12)
            System.out.println("двенадцать");
                if(num == 13)
            System.out.println("тринадцать");
                if(num == 14)
            System.out.println("четырнадцать");
                if(num == 15)
            System.out.println("пятнадцать");
                if(num == 16)
            System.out.println("шестнадцать");
                if(num == 17)
            System.out.println("семнадцать");
                if(num == 18)
            System.out.println("восемнадцать");
                if(num == 19)
            System.out.println("девятнадцать");  
} else {
        int des = num / 10;
        int edin = num %10;
// десятки if(des == 2)
            System.out.print("двадцать  ");
        if(des == 3)
            System.out.print("тридцать ");
        if(des == 4)
            System.out.print("сорок ");
        if(des == 5)
            System.out.print("пятьдесят ");
        if(des == 6)
            System.out.print("шестьдесят ");
        if(des == 7)
            System.out.print("семьдесят ");
        if(des == 8)
            System.out.print("восемьдесят ");
        if(des == 9)
            System.out.print("девяносто ");
        
//единицы
        if(edin == 1)
            System.out.println("один");
        if(edin == 2)
            System.out.println("два");
        if(edin == 3)
            System.out.println("три");
        if(edin == 4)
            System.out.println("четыре");
        if(edin == 5)
            System.out.println("пять");
        if(edin == 6)
            System.out.println("шесть");
        if(edin == 7)
            System.out.println("семь");
        if(edin == 8)
            System.out.println("восемь");
        if(edin == 9)
            System.out.println("девять"); 
            }
    }
}
