
package hmtsks.oop.task7;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        Phone[] phones = new Phone[10];
        phones[0] = new Phone(1, "Зеленов Николай Константинович", "Kharkiv, Sumska str. 12", "10000001", 1000, 2000, 200, 50);
        phones[1] = new Phone(2, "Ильин Филарет Романович",        "Kharkiv, Sumska str. 12", "10000002", 1000, 2000, 80, 25);
        phones[2] = new Phone(3, "Изофатов Иосиф Давидович",       "Kharkiv, Sumska str. 12", "10000003", 1000, 2000, 500, 0);
        phones[3] = new Phone(4, "Соколова Лилия Ильинична",       "Kharkiv, Sumska str. 12", "10000004", 1000, 2000, 400, 150);
        phones[4] = new Phone(5, "Лебедев Борислав Алексеевич",    "Kharkiv, Sumska str. 12", "10000005", 1000, 2000, 0, 0);
        phones[5] = new Phone(6, "Александров Кир Альбертович",    "Kharkiv, Sumska str. 12", "10000006", 1000, 2000, 120, 200);
        phones[6] = new Phone(7, "Сысолятин Серафим Максимович",   "Kharkiv, Sumska str. 12", "10000007", 1000, 2000, 20, 0);
        phones[7] = new Phone(8, "Власов Антонин Миронович",       "Kharkiv, Sumska str. 12", "10000008", 1000, 2000, 200, 50);
        phones[8] = new Phone(9, "Вирская Алёна Богдановна",       "Kharkiv, Sumska str. 12", "10000009", 1000, 2000, 1000, 250);
        phones[9] = new Phone(10, "Ильин Клавдий Альбертович",     "Kharkiv, Sumska str. 12", "10000010", 1000, 2000, 200, 50);
        
        phoneIntimeList(phones);
        phoneOuttime(phones);
        System.out.println("В алфавитном порядке: ");
        alphabet(phones);
        for (Phone phone : phones) {
            System.out.println(phone);
        }
        
    }
    //------------------------------------------------------------------------------
       static void phoneIntimeList(Phone[] phones){
        System.out.println("Введите время внутригородских разговоров");
        Scanner in = new Scanner(System.in);
            int intime = in.nextInt();
           for (Phone phone : phones) {
               if(phone.getIntime() > intime){
                   System.out.println(phone);
           }
        }
    }
//------------------------------------------------------------------------------
          static void phoneOuttime(Phone[] phones){
              System.out.println("Они пользовались междугородней связью!!!");
           for (Phone phone : phones) {
               if(phone.getOuttime() > 0){
                   System.out.println(phone);
           }
        }
    }
//------------------------------------------------------------------------------
              static void alphabet(Phone[] phones){
        for (int i = 0; i < phones.length; i++) {
            for (int j = 0; j < phones.length-1; j++) {
                if (phones[j].compareTo(phones[j +1]) > 0){
                    Phone t = phones[j];
                    phones[j] = phones[j +1];
                    phones[j +1] = t;
                }
            }
        }
    }
}
