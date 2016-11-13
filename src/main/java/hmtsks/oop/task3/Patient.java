
package hmtsks.oop.task3;


public class Patient {
     int id ;
     String fullname;
     String adress;
     String telnumber;
     int cardnumber;
     String diagnosis;

    public Patient(int id, String fullname, String adress, String telnumber, int cardnumber, String diagnosis) {
        this.id = id;
        this.fullname = fullname;
        this.adress = adress;
        this.telnumber = telnumber;
        this.cardnumber = cardnumber;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", fullname=" + fullname + ", adress=" + adress + ", telnumber=" + telnumber + ", cardnumber=" + cardnumber + ", diagnosis=" + diagnosis + '}';
    }
    
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



  

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
     
}
