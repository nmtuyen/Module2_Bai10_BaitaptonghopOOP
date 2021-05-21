package laptopManagement;

public class Main2 {
    public static void main(String[] args) {
        LaptopManager ltmm = new LaptopManager();
        ltmm.add("1", new Laptop("1", "samsung", 15000000, 2020, 15));
        ltmm.add("3", new Laptop("3", "sony", 58000000, 2018, 16));
        ltmm.add("6", new Laptop("6", "asus", 13000000, 2019, 16));
        ltmm.add("5", new Laptop("5", "acer", 13000000, 2019, 16));
        ltmm.add("4", new Laptop("4", "sony", 13000000, 2019, 16));
        ltmm.add("2", new Laptop("2", "lenove", 13000000, 2019, 16));
        ltmm.display();
        ltmm.edit("2",new Laptop("10", "apple", 20000000, 2025, 15));
        ltmm.display();
        ltmm.delete("3");
        ltmm.display();
        ltmm.sort();
        ltmm.display();
    }
}
