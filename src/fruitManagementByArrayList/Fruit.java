package fruitManagementByArrayList;

public class Fruit {
    public String name;
    public int price;
    public String color;

    public Fruit() {
    }

    public Fruit(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Fruit{" +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", color:'" + color + '\'' +
                '}';
    }
}
