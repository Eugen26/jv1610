//int id, String name, String author, String publishing, int year, int pagenumber, int price, String binding
package hmtsks.oop.task5;

import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        program();
    }
    
    static void program(){
        Book[] books = new Book[10];
        
        books[0] = new Book(1, "Деликатесы Декстера",     "Джеффри Линдсей",   "Orion" ,           2012, 450, 100, "мягкий");
        books[1] = new Book(2, "Чёрный Отряд",            "Глен Кук",          "Астрель" ,         2012, 352, 152, "твердый");
        books[2] = new Book(3, "Граф Монте-Кристо",       "Александр Дюма",    "Тимошка" ,         2012, 96, 60, "твердый");
        books[3] = new Book(4, "Графиня де Монсоро",      "Александр Дюма",    "Арт-Бизнес-Центр", 1992, 860, 200, "твердый");
        books[4] = new Book(5, "Улитка на склоне",        "Братья Стругацкие", "АСТ" ,             2015, 320, 70, "мягкий");
        books[5] = new Book(6, "Дівчина у потягу",        "Пола Хокинс",       "Книжный клуб ",    2016, 320, 84, "твердый");
        books[6] = new Book(7, "Найкоротша історія часу", "Стивен Хокинг",     "Книжный клуб" ,    2016, 160, 113, "твердый");
        books[7] = new Book(8, "Код да Винчи",            "Дэн Браун",         "Книжный клуб" ,    2009, 480, 80, "твердый");
        books[8] = new Book(9, "ДНК",                     "Сергей Жадан",      "Книжный клуб" ,    2016, 240, 93, "твердый");
        books[9] = new Book(10, "Пикник на обочине",      "Братья Стругацкие", "АСТ" ,             2015, 256, 75, "мягкий");
        
//        System.out.println("Книги заданного автора: ");
//        authorList(books);
        publishingList(books);
//          booksList(books);
    }
//------------------------------------------------------------------------------
    static void authorList(Book[] books){
        String author;
        System.out.println("Введите автора");
        Scanner in = new Scanner(System.in);
        author = in.next();
        for (Book book : books) {
            if(book.getAuthor().equals(author)){
                System.out.println(book);
            }else{
                System.out.println("Совпадения не найдены");
            }
        }
    }
//------------------------------------------------------------------------------
    static void publishingList(Book[] books){
        String pub;
        System.out.println("Введите издательство");
        Scanner in = new Scanner(System.in);
        pub = in.next();
        for (Book book : books) {
            if(book.getPublishing().equals(pub)){
                System.out.println(book);
            }
        }
    }
//------------------------------------------------------------------------------
    static void booksList(Book[] books){
        System.out.println("Введите год");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
            for (Book book : books) {
                if (book.getYear() >= year){
                    System.out.println(book);
                }
        }
    
    }
//------------------------------------------------------------------------------
}
