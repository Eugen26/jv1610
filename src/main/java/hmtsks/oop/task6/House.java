
package hmtsks.oop.task6;


public class House {
     int id ;
     int number ;
     int area ;
     int floor ;
     int rooms ;
     String street;
     String type;
     int lifetime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + id + ", number=" + number + ", area=" + area + ", floor=" + floor + ", rooms=" + rooms + ", street=" + street + ", type=" + type + ", lifetime=" + lifetime + '}';
    }

    public House(int id, int number, int area, int floor, int rooms, String street, String type, int lifetime) {
        this.id = id;
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.street = street;
        this.type = type;
        this.lifetime = lifetime;
    }
    
     
}
