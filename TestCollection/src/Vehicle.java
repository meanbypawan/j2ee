
public class Vehicle {    
  private int id;
  private String type;
  private String brand;
  private int price;

    public Vehicle() {
    }

    public Vehicle(int id, String type, String brand, int price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
  
}
