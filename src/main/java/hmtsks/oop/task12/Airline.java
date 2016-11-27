
package hmtsks.oop.task12;


public class Airline {
    String destination;
    int flightnumber;
    String type;
    int time;
    String day;

    public Airline(String destination, int flightnumber, String type, int time, String day) {
        this.destination = destination;
        this.flightnumber = flightnumber;
        this.type = type;
        this.time = time;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Airline{" + "destination=" + destination + ", flightnumber=" + flightnumber + ", type=" + type + ", time=" + time + ", day=" + day + '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(int flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    
}
