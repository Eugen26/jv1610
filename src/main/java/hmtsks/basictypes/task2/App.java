
package hmtsks.basictypes.task2;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
         //Окружность
        System.out.println("Введите радиус внешней окр-ти");
        System.out.println("Введите радиус внутренней окр-ти");
           Scanner R = new Scanner(System.in);
           Scanner r = new Scanner(System.in);
            double exrad = R.nextInt();
            double inrad = r.nextInt();
        //circumference
            double cirfer = exrad * 2 * Math.PI;
        //circle area
            double cirar = Math.PI * Math.pow(exrad, 2);
        //ring area
            double ringar = Math.PI *(Math.pow(exrad, 2) - Math.pow(inrad, 2));
        System.out.println("Длина окружности: " + cirfer);
        System.out.println("Площадь окружности: " + cirar);
        System.out.println("Площадь кольца: " + ringar);
        //Треугольник
        System.out.println("Введите стороны треугольника");
           Scanner first = new Scanner(System.in);
           Scanner second = new Scanner(System.in);
           Scanner third = new Scanner(System.in);
            double a = first.nextInt();
            double b = second.nextInt();
            double c = third.nextInt();
        //triangle perimeter  
            double tper = a + b + c;
        //area of a triangle
            double hper = (a + b + c) / 2;// полупериметр
            double aroftr = Math.sqrt((hper-((hper -a) * (hper -b) * (hper -c))));
        System.out.println("Периметр треугольника: " + tper);
        System.out.println("Площадь треугольника: " + aroftr);
        //прямоугольник
        System.out.println("Введите стороны прямоугольника");
           Scanner fir = new Scanner(System.in);
           Scanner sec = new Scanner(System.in);
            double A = fir.nextInt();
            double B = sec.nextInt();
        //rectangle perimeter
            double rper = (A + B) * 2;
        //area of a rectangle
            double arofrec = A * B;
        System.out.println("Периметр прямоугольника: " + rper);
        System.out.println("Площадь прямоугольника: " + arofrec);
    }
}
