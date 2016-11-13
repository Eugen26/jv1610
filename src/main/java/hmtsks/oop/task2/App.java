// + "id=" + id + ", fullname=" + fullname + ", adress=" + adress + ", cardnumber=" + cardnumber + ", accountnumber=" + accountnumber
package hmtsks.oop.task2;

//import java.util.Arrays;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        program();
    }
    static void program(){
        Customer[] customers = new Customer[10];
        
        customers[0] = new Customer(1, "Зеленов Николай Константинович", "Kharkiv, Sumska str. 12", 10000001, 111);
        customers[1] = new Customer(2, "Ильин Филарет Романович", "Kharkiv, Sumska str. 12", 10000002, 112);
        customers[2] = new Customer(3, "Изофатов Иосиф Давидович", "Kharkiv, Sumska str. 12", 10000003, 113);
        customers[3] = new Customer(4, "Соколова Лилия Ильинична", "Kharkiv, Sumska str. 12", 10000004, 114);
        customers[4] = new Customer(5, "Лебедев Борислав Алексеевич", "Kharkiv, Sumska str. 12", 10000005, 115);
        customers[5] = new Customer(6, "Александров Кир Альбертович", "Kharkiv, Sumska str. 12", 10000006, 116);
        customers[6] = new Customer(7, "Сысолятин Серафим Максимович", "Kharkiv, Sumska str. 12", 10000007, 117);
        customers[7] = new Customer(8, "Власов Антонин Миронович", "Kharkiv, Sumska str. 12", 10000008, 118);
        customers[8] = new Customer(9, "Вирская Алёна Богдановна", "Kharkiv, Sumska str. 12", 10000009, 119);
        customers[9] = new Customer(10, "Ильин Клавдий Альбертович", "Kharkiv, Sumska str. 12", 10000010, 110);
        
        customerList(customers);
    }
    
    static void customerList(Customer[] customers){
        System.out.println("Введите номер кредитной карты(начало интервала) типа 100000**");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        System.out.println("Введите номер кредитной карты(конец интервала типа 100000**)");
        int max = in.nextInt();
            for (Customer customer : customers) {
                if (customer.getCardnumber() >= min && customer.getCardnumber() <= max){
                    System.out.println(customer);
                }
        }
    }
}
