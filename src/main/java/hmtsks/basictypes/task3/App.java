
package hmtsks.basictypes.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         System.out.println("Введите радиус внешней окр-ти");
            Scanner R = new Scanner(System.in);
                double exrad = R.nextInt();
        System.out.println("Введите радиус внутренней окр-ти");
            Scanner r = new Scanner(System.in);
                double inrad = r.nextInt();
        //circumference
                double cirfer = exrad * 2 * Math.PI;
        //circle area
                double cirar = Math.PI * Math.pow(exrad, 2);
        //ring area
                double ringar = Math.PI *(Math.pow(exrad, 2) - Math.pow(inrad, 2));
        //прямоугольник
        System.out.println("Введите стороны прямоугольника");
           Scanner fir = new Scanner(System.in);
                double A = fir.nextInt();
           Scanner sec = new Scanner(System.in);
                double B = sec.nextInt();
        //rectangle perimeter
                double rper = (A + B) * 2;
        //area of a rectangle
                double arofrec = A * B;
        //cylinder volume
                double cylvol = A * Math.pow(exrad, 2);
        System.out.println("Объем цилиндра: " + cylvol);    
        //volume of the hollow cylinder
                double volholcyl = A *ringar;
        System.out.println("Объем полого цилиндра: " + volholcyl);
        //area of the lateral surface of the cylinder
                double latsurcyl = A *cirfer;
        System.out.println(" Площадь боковой поверхности цилиндра: " + latsurcyl);
        //the volume of a sphere
                double volsph = 4/3 * Math.PI * Math.pow(exrad, 3);
        System.out.println("Объем шара: " + volsph);
        //the surface area of a sphere
                double surarsph = 4 * cirar;
        System.out.println("Площадь поверхности шара: " + surarsph);
        //Ребра пар-да будем считать равными сторонам прям-ка: А и В.
        //Т.о. ребра = A,A,B.
        //the volume of the box
                double volbox = A * B * A;
        System.out.println("Объем параллелепипеда: " + volbox);
        //The total surface of the box
                double totsurbox = 2*((A * B) + (B * A) + (A * A));
        System.out.println("Полная  поверхность параллелепипеда: " + totsurbox);
        //Будем считать,что тетраэдр - правильный. В таком случае, все четыре грани являются равносторонними треугольниками.
        System.out.println("Введите сторону треугольника");
            Scanner stor = new Scanner(System.in);
                double x = stor.nextInt();
        //The volume of the regular tetrahedron
                double voltet = (Math.sqrt(2) / 12) * Math.pow(x, 3);
        System.out.println("Объем тетраэдра: " + totsurbox);
        
        //The area of the total surface of a regular tetrahedron
                double totsurtet = Math.sqrt(3) * Math.pow(x, 2);
        System.out.println("Объем тетраэдра: " + totsurtet);
    }
}
