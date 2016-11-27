
package hmtsks.oop.task7;




public class Phone {
    int id;
    String fullname;
    String addres;
    String cardnumber;
    int debet;
    int kredit;
    int intime;
    int outtime;

    public Phone(int id, String fullname, String addres, String cardnumber, int debet, int kredit, int intime, int outtime) {
        this.id = id;
        this.fullname = fullname;
        this.addres = addres;
        this.cardnumber = cardnumber;
        this.debet = debet;
        this.kredit = kredit;
        this.intime = intime;
        this.outtime = outtime;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", fullname=" + fullname + ", addres=" + addres + ", cardnumber=" + cardnumber + ", debet=" + debet + ", kredit=" + kredit + ", intime=" + intime + ", outtime=" + outtime + '}';
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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public int getIntime() {
        return intime;
    }

    public void setIntime(int intime) {
        this.intime = intime;
    }

    public int getOuttime() {
        return outtime;
    }

    public void setOuttime(int outtime) {
        this.outtime = outtime;
    }
    
    public int compareTo(Object obj){
        Phone p = (Phone) obj;
             return (this.fullname.compareTo(p.fullname));
    }
}
