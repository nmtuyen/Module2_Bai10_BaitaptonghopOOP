package roomHotelManagementByArrayList;

public class RoomHotel {
    int price;
    char category;

    public RoomHotel(int price, char category) {
        this.price = price;
        this.category = category;
    }

    public RoomHotel() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "RoomHotel{" +
                "price=" + price +
                ", category=" + category +
                '}';
    }
}
