//  Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа. 
//int id, String fullname, String telNumber, int yearOfBirth, int monthOfBirth, int dayOfBirth, String department, String group, String adress, int course
package hmtsks.oop.task1;


import java.util.Scanner;


public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
program();
    }
    static void program(){
        Student[] students = new Student[10];

        students[0] = new Student(1, "Зеленов Николай Константинович", "09300000000", 1990, 1, 1, "Economic", "1", "Kharkiv, Sumska str. 12", 2);
        students[1] = new Student(2, "Ильин Филарет Романович", "09300000001", 1991, 5, 13, "Mathematic", "2", "Kharkiv, Pushkina str. 1", 2);
        students[2] = new Student(3, "Изофатов Иосиф Давидович", "09300000002", 1992, 12, 3, "Economic", "3", "Kharkiv, Vlasova str. 12", 1);
        students[3] = new Student(4, "Соколова Лилия Ильинична", "09300000003", 1990, 11, 1, "Biology", "1", "Kharkiv, Sumska str. 12", 4);
        students[4] = new Student(5, "Лебедев Борислав Алексеевич", "09300000004", 1991, 4, 10, "Economic", "2", "Kharkiv, Sumska str. 12", 5);
        students[5] = new Student(6, "Александров Кир Альбертович", "09300000005", 1991, 3, 15, "Economic", "1", "Kharkiv, Sumska str. 12", 5);
        students[6] = new Student(7, "Сысолятин Серафим Максимович", "09300000006", 1990, 8, 20, "Economic", "1", "Kharkiv, Sumska str. 12",2 );
        students[7] = new Student(8, "Власов Антонин Миронович", "09300000007", 1992, 2, 17, "Mathematic", "2", "Kharkiv, Sumska str. 12", 3);
        students[8] = new Student(9, "Вирская Алёна Богдановна", "09300000008", 1992, 4, 2, "Biology", "2", "Kharkiv, Sumska str. 12", 1);
        students[9] = new Student(10, "Ильин Клавдий Альбертович", "09300000009", 1991, 1, 10, "Mathematic", "1", "Kharkiv, Sumska str. 12", 3);
        
//int year = enterYear();
        
//        String chosenDep = chooseDepartment();
//        listStudentsOfChosenDepartment(students, chosenDep);
//        StudentsListForEachDepAndCourse(students);
//System.out.println("given year students : ");
//Task с. Список студентов,родившихся после заданного года;
//StudentsListForAdjustYear(students,year);
//Task d. Вывод списка учебной группы;
groupList(students);
    }
//------------------------------------------------------------------------------
    static void printChooseDepartmentMenu(){
        System.out.println("Выберите факультет");
        System.out.println("1.Economic");
        System.out.println("2.Mathematic");
        System.out.println("3.Biology");
        System.out.println("Выход - любое другое число ");
    }
//------------------------------------------------------------------------------
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
//------------------------------------------------------------------------------
    static void listStudentsOfChosenDepartment(Student[] students, String needDep){
    //    Student[] array = new Student[10];
        for (Student student : students) {
        //    for (Student student1 : array) {
                if(student.getDepartment().equals(needDep)){
                //    array[student1] = students[student];
                           System.out.println(student);
                }
            }
      //  }
    // return array;
    }
//------------------------------------------------------------------------------
    static String chooseDepartment (){
        String chosenDep = "null";
        boolean exit = false;
        while (!exit) {
            printChooseDepartmentMenu();
        int choise = readUserChoise();
            if(choise > 3 || choise < 1){
                break;
            }
        switch(choise){
            case 1:{
                chosenDep = "Economic" ;
                exit = true;
            }break;
            case 2:{
                chosenDep = "Mathematic";
                exit = true;
            }break;
            case 3:{
                chosenDep = "Biology" ;
                exit = true;
            }break;
            default : exit = true;
            break;
        }
    }
        return chosenDep;
    }
//------------------------------------------------------------------------------
    static void StudentsListForEachDepAndCourse(Student[] students){
        System.out.println("Economic department");
        listStudentsOfChosenDepartment(students, "Economic");
        System.out.println("Biology department");
        listStudentsOfChosenDepartment(students, "Biology");
        System.out.println("Mathematic department");
        listStudentsOfChosenDepartment(students, "Mathematic");
    }
//------------------------------------------------------------------------------
    static void StudentsListForAdjustYear(Student[] students, int year){
         for (Student student : students) {
             if(student.getYearOfBirth() > year){
                 System.out.println(student);
             }
         }
    }
//------------------------------------------------------------------------------
    static int enterYear(){
        System.out.println("Введите год");
        int year1 = readUserChoise();
        return year1;
    }
//------------------------------------------------------------------------------
    static void ChooseDepCourseGroup(Student[] students, String needDep, int course, String group){
        for (Student student : students) {
                if(student.getDepartment().equals(needDep) && (student.getCourse() == course) && (student.getGroup().equals(group))){
                           System.out.println(student);
                }
            }
    }
//------------------------------------------------------------------------------
//Task d. Вывод списка учебной группы;
    static void groupList(Student[] students){
        System.out.println("Students list of Economic dep., 2 course, 1 group: ");
        ChooseDepCourseGroup(students, "Economic", 2, "1");
    }
}

