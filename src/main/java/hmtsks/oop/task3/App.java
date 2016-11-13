// int id, String fullname, String adress, String telnumber, int cardnumber, String diagnosis
package hmtsks.oop.task3;

import java.util.Scanner;


public class App {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        program();
    }
    static void program(){
             Patient[] patients = new Patient[10];

        patients[0] = new Patient(1, "Зеленов Николай Константинович", "Kharkiv, Sumska str. 12",  "09300000000", 1000, "bronchitis");
        patients[1] = new Patient(2, "Ильин Филарет Романович",        "Kharkiv, Pushkina str. 1", "09300000001", 1001, "diarrhea");
        patients[2] = new Patient(3, "Изофатов Иосиф Давидович",       "Kharkiv, Vlasova str. 12", "09300000002", 1002, "gastritis");
        patients[3] = new Patient(4, "Соколова Лилия Ильинична",       "Kharkiv, Sumska str. 12",  "09300000003", 1003, "herpes");
        patients[4] = new Patient(5, "Лебедев Борислав Алексеевич",    "Kharkiv, Sumska str. 12",  "09300000004", 1004, "bronchitis");
        patients[5] = new Patient(6, "Александров Кир Альбертович",    "Kharkiv, Sumska str. 12",  "09300000005", 1005, "herpes");
        patients[6] = new Patient(7, "Сысолятин Серафим Максимович",   "Kharkiv, Sumska str. 12",  "09300000006", 1006, "gastritis");
        patients[7] = new Patient(8, "Власов Антонин Миронович",       "Kharkiv, Sumska str. 12",  "09300000007", 1007, "diarrhea");
        patients[8] = new Patient(9, "Вирская Алёна Богдановна",       "Kharkiv, Sumska str. 12",  "09300000008", 1008, "diarrhea");
        patients[9] = new Patient(10, "Ильин Клавдий Альбертович",     "Kharkiv, Sumska str. 12",  "09300000009", 1009, "bronchitis");
        
//        String chosenDiagnosis = chooseDiagnosis();
//        PatientListDiagnosis(patients, chosenDiagnosis);
        PatientListNumber(patients);
        
    }
    
    //------------------------------------------------------------------------------
         static void printChooseDiagnosisMenu(){
        System.out.println("Выберите диагноз");
        System.out.println("1.bronchitis");
        System.out.println("2.diarrhea");
        System.out.println("3.gastritis");
        System.out.println("4.herpes");
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
         static String chooseDiagnosis (){
        String chosenDiagnosis = "null";
        boolean exit = false;
        while (!exit) {
            printChooseDiagnosisMenu();
        int choise = readUserChoise();
            if(choise > 4 || choise < 1){
                break;
            }
        switch(choise){
            case 1:{
                chosenDiagnosis = "bronchitis" ;
                exit = true;
            }break;
            case 2:{
                chosenDiagnosis = "diarrhea";
                exit = true;
            }break;
            case 3:{
                chosenDiagnosis = "gastritis" ;
                exit = true;
            }break;
             case 4:{
                chosenDiagnosis = "herpes" ;
                exit = true;
            }break;
            default : exit = true;
            break;
        }
    }
        return chosenDiagnosis;
    }
//------------------------------------------------------------------------------
         static void PatientListDiagnosis(Patient[] patients, String needDiag){
         for (Patient patient : patients) {
              if(patient.getDiagnosis().equals(needDiag)){
                           System.out.println(patient);
                }
         }
               
    }
//------------------------------------------------------------------------------
         static void PatientListNumber(Patient[] patients){
        System.out.println("Введите номер мед. карты(начало интервала) типа 100*");
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        System.out.println("Введите номер мед. карты(конец интервала типа 100*)");
        int max = in.nextInt();
            for (Patient patient : patients) {
                if (patient.getCardnumber() >= min && patient.getCardnumber() <= max){
                    System.out.println(patient);
                }
        }
    }
    
}
