//  Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа. 
package hmtsks.oop.task1;




public class Student {
    protected int id ;
    protected String fullname;
     String telNumber;
     int yearOfBirth;
     int monthOfBirth;
     int dayOfBirth;
     String department;
     String group;
     String adress;
     int course;
     



    public Student(int id, String fullname, String telNumber, int yearOfBirth, int monthOfBirth, int dayOfBirth, String department, String group, String adress, int course) {
        this.id = id;
        this.fullname = fullname;
        this.telNumber = telNumber;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.department = department;
        this.group = group;
        this.adress = adress;
        this.course = course;
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

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    
    
//    void printStudents(){
//        System.out.println(Student);
//    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullname=" + fullname + ", telNumber=" + telNumber + ", yearOfBirth=" + yearOfBirth + ", monthOfBirth=" + monthOfBirth + ", dayOfBirth=" + dayOfBirth + ", department=" + department + ", group=" + group + ", adress=" + adress + ", course=" + course + '}';
    }
    
    
    
    
    }
