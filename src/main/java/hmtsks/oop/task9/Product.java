
package hmtsks.oop.task9;


public class Product {
    int id;
    String name;
    int upc;
    String manufacturer;
    int price;
    int lifetime;
    int number;

    public Product(int id, String name, int upc, String manufacturer, int price, int lifetime, int number) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.lifetime = lifetime;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", upc=" + upc + ", manufacturer=" + manufacturer + ", price=" + price + ", lifetime=" + lifetime + ", number=" + number + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUpc() {
        return upc;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
}
