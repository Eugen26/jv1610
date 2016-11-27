
package hmtsks.oop.task4;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        programm();
    }
    static void programm(){
        Abiturient[] abiturients = new Abiturient[10];
        abiturients[0] = new Abiturient(1, "Зеленов Николай Константинович","Kharkiv, Sumska str. 12", "09300000000", 3, 4, 2);
        abiturients[1] = new Abiturient(2, "Ильин Филарет Романович",       "Kharkiv, Sumska str. 12", "09300000001", 5, 4, 5);
        abiturients[2] = new Abiturient(3, "Изофатов Иосиф Давидович",      "Kharkiv, Sumska str. 12", "09300000003", 5, 4, 4);
        abiturients[3] = new Abiturient(4, "Соколова Лилия Ильинична",      "Kharkiv, Sumska str. 12", "09300000004", 3, 4, 2);
        abiturients[4] = new Abiturient(5, "Александров Кир Альбертович",   "Kharkiv, Sumska str. 12", "09300000005", 5, 5, 5);
        abiturients[5] = new Abiturient(6, "Сысолятин Серафим Максимович",  "Kharkiv, Sumska str. 12", "09300000006", 5, 4, 3);
        abiturients[6] = new Abiturient(7, "Власов Антонин Миронович",      "Kharkiv, Sumska str. 12", "09300000007", 5, 5, 5);
        abiturients[7] = new Abiturient(8, "Вирская Алёна Богдановна",      "Kharkiv, Sumska str. 12", "09300000008", 2, 2, 2);
        abiturients[8] = new Abiturient(9, "Лебедев Борислав Алексеевич",   "Kharkiv, Sumska str. 12", "09300000009", 5, 4, 3);
        abiturients[9] = new Abiturient(10, "Ильин Клавдий Альбертович",    "Kharkiv, Sumska str. 12", "09300000010", 3, 4, 2);
        
        abiLoosers(abiturients);
        abiSumm(abiturients);
    }
//------------------------------------------------------------------------------
    static void abiLoosers(Abiturient[] abiturients){
        System.out.println("Абитуриенты с неудовлетворительными оценками");
        for (Abiturient abiturient : abiturients) {
            if(abiturient.getMark() == 2 || abiturient.getMark1() == 2 || abiturient.getMark2() == 2){
                System.out.println(abiturient);
            }
        }
    }
//------------------------------------------------------------------------------
    static void abiSumm(Abiturient[] abiturients){
        System.out.println("Введите сумму баллов(макс. 15 баллов)");
        Scanner in = new Scanner(System.in);
            int summ = in.nextInt();
        for (Abiturient abiturient : abiturients) {
            int summ1 = abiturient.getMark() + abiturient.getMark1() + abiturient.getMark2() ;
            if(summ1 > summ){
                System.out.println(abiturient);
            }
        }
    }
//------------------------------------------------------------------------------
}
