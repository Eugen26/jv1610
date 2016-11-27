
package hmtsks.oop.task9;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        Product[] products = new Product[10];
        products[0] = new Product(1, "Milk", 0001101, "Romol", 15, 24, 30);
        products[1] = new Product(2, "Bread", 0001111, "Bakery", 10, 2, 20);
        products[2] = new Product(3, "Milk", 0041101, "Romol2", 17, 16, 40);
        products[3] = new Product(4, "Cheeze", 1101101, "Ternopol", 120, 60, 90);
        products[4] = new Product(5, "Cheeze", 0321101, "Kharkiv", 80, 45, 50);
        products[5] = new Product(6, "Icecreame", 0001152, "Kiev", 25, 365, 200);
        products[6] = new Product(7, "Milk", 9871101, "Romol3", 12, 36, 25);
        products[7] = new Product(8, "Milk", 0001101, "Romol4", 26, 7, 10);
        products[8] = new Product(9, "Bread", 1981110, "Bakery2", 15, 7, 30);
        products[9] = new Product(10, "Icecreame", 0001101, "Lviv", 30, 365, 150);
        
//        productNameList(products);
//        productNamePriceList(products);
        productLifetimeList(products);
    }
//------------------------------------------------------------------------------
       static void productNameList(Product[] products){
            System.out.println("Введите наименование товара");
            Scanner in = new Scanner(System.in);
                String name = in.next();
                    for (Product product : products) {
                        if(product.getName().equals(name)){
                            System.out.println(product);
                        }
                    }
        }
//------------------------------------------------------------------------------
       static void productNamePriceList(Product[] products){
             System.out.println("Введите наименование товара");
             Scanner in = new Scanner(System.in);
                String name = in.next();
                   System.out.println("Введите цену");
                   Scanner in1 = new Scanner(System.in);
                   int price = in1.nextInt();
                        for (Product product : products) {
                            if(product.getName().equals(name) && product.getPrice() <= price){
                            System.out.println(product);
                            }
                        }
        }
//------------------------------------------------------------------------------
            static void productLifetimeList(Product[] products){
                   System.out.println("Введите срок хранения");
                   Scanner in = new Scanner(System.in);
                   int lifetime = in.nextInt();
                        for (Product product : products) {
                            if(product.getLifetime() > lifetime){
                            System.out.println(product);
                            }
                        }
        }
//------------------------------------------------------------------------------
}
