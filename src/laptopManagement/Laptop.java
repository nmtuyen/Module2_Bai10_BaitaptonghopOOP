package laptopManagement;

public class Laptop implements Cloneable{
    private String LaptopID;
    private String brand;
    private int price;
    private int yearMake;
    private int screenSize;

    public Laptop(String laptopID, String brand, int price, int yearMake, int screenSize) {
        LaptopID = laptopID;
        this.price = price;
        this.brand = brand;
        this.yearMake = yearMake;
        this.screenSize = screenSize;
    }

    public Laptop() {
    }

    public String getLaptopID() {
        return LaptopID;
    }

    public void setLaptopID(String laptopID) {
        LaptopID = laptopID;
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

    public int getYearMake() {
        return yearMake;
    }

    public void setYearMake(int yearMake) {
        this.yearMake = yearMake;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "LaptopID='" + LaptopID + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", yearMake=" + yearMake +
                ", screenSize=" + screenSize +
                '}';
    }
}
