package mobileManagementByArrayList;

public class Mobile{
    private String imei;
    private String name;
    private String brand;
    private int price;
    private String color;

    public Mobile() {
    }

    public Mobile(String imei, String name, String brand, int price, String color) {
        this.imei = imei;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "imei:'" + imei + '\'' +
                ", name:'" + name + '\'' +
                ", brand:'" + brand + '\'' +
                ", price:" + price +
                ", color:'" + color + '\'' +
                '}';
    }


}
