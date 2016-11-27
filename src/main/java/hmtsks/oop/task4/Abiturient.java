
package hmtsks.oop.task4;


public class Abiturient {
    int id;
    String fullname;
    String addres;
    String telephone;
    int mark;
    int mark1;
    int mark2;
   

    public Abiturient(int id, String fullname, String addres, String telephone, int mark, int mark1, int mark2) {
        this.id = id;
        this.fullname = fullname;
        this.addres = addres;
        this.telephone = telephone;
        this.mark = mark;
        this.mark1 = mark1;
        this.mark2 = mark2;
     
    }

    @Override
    public String toString() {
        return "Abiturient{" + "id=" + id + ", fullname=" + fullname + ", addres=" + addres + ", telephone=" + telephone + ", mark=" + mark + ", mark1=" + mark1 + ", mark2=" + mark2 + '}';
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark1() {
        return mark1;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }


    
}
