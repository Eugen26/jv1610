
package hmtsks.oop.task2;


public class Customer implements Comparable{
     int id ;
     String fullname;
     String adress;
     long cardnumber;
    long accountnumber;

    public Customer(int id, String fullname, String adress, long cardnumber, long accountnumber) {
        this.id = id;
        this.fullname = fullname;
        this.adress = adress;
        this.cardnumber = cardnumber;
        this.accountnumber = accountnumber;
    }
    
    

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", fullname=" + fullname + ", adress=" + adress + ", cardnumber=" + cardnumber + ", accountnumber=" + accountnumber + '}';
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

    public long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
    
     @Override
    public int compareTo(Object obj){
        Customer c = (Customer) obj;
             return (this.fullname.compareTo(c.fullname));
    }

}
