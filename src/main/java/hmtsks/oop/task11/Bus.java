
package hmtsks.oop.task11;


public class Bus {
    String fullname;
    int number;
    int routenumber;
    String brand;
    int year;
    int mileage;

    public Bus(String fullname, int number, int routenumber, String brand, int year, int mileage) {
        this.fullname = fullname;
        this.number = number;
        this.routenumber = routenumber;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Bus{" + "fullname=" + fullname + ", number=" + number + ", routenumber=" + routenumber + ", brand=" + brand + ", year=" + year + ", mileage=" + mileage + '}';
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRoutenumber() {
        return routenumber;
    }

    public void setRoutenumber(int routenumber) {
        this.routenumber = routenumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
     
}
