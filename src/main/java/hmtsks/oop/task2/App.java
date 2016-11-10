// + "id=" + id + ", fullname=" + fullname + ", adress=" + adress + ", cardnumber=" + cardnumber + ", accountnumber=" + accountnumber
package hmtsks.oop.task2;


public class App {
    public static void main(String[] args) {
        program();
    }
    static void program(){
        Customer[] customers = new Customer[10];
        
        customers[0] = new Customer(1, "Зеленов Николай Константинович", "Kharkiv, Sumska str. 12", 10000001, 111);
        customers[1] = new Customer(1, "Ильин Филарет Романович", "Kharkiv, Sumska str. 12", 10000001, 112);
        customers[2] = new Customer(1, "Изофатов Иосиф Давидович", "Kharkiv, Sumska str. 12", 10000003, 113);
        customers[3] = new Customer(1, "Соколова Лилия Ильинична", "Kharkiv, Sumska str. 12", 10000004, 114);
        customers[4] = new Customer(1, "Лебедев Борислав Алексеевич", "Kharkiv, Sumska str. 12", 10000005, 115);
        customers[5] = new Customer(1, "Александров Кир Альбертович", "Kharkiv, Sumska str. 12", 10000006, 116);
        customers[6] = new Customer(1, "Сысолятин Серафим Максимович", "Kharkiv, Sumska str. 12", 10000007, 117);
        customers[7] = new Customer(1, "Власов Антонин Миронович", "Kharkiv, Sumska str. 12", 10000008, 118);
        customers[8] = new Customer(1, "Вирская Алёна Богдановна", "Kharkiv, Sumska str. 12", 10000009, 119);
        customers[9] = new Customer(1, "Ильин Клавдий Альбертович", "Kharkiv, Sumska str. 12", 10000010, 110);
    }
    
    public int compareTo(Customer o){
        return this.compareTo(o.fullname);
    }

    private int compareTo(String fullname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
