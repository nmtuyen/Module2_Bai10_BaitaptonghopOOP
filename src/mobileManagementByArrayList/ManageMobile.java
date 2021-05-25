package mobileManagementByArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ManageMobile {
    ArrayList<Mobile> mobiles = new ArrayList<>();

    public ManageMobile() {
        mobiles = new ArrayList<>();
        mobiles.add(new Mobile("123456", "1280", "Nokia", 500, "black"));
        mobiles.add(new Mobile("789561", "6300", "Nokia", 700, "gold"));
        mobiles.add(new Mobile("653235", "galaxy", "Samsung", 650, "gray"));
        mobiles.add(new Mobile("456489", "Iphone12", "Apple", 1500, "pink"));
        mobiles.add(new Mobile("123123", "Iphone13", "Apple", 1500, "black"));
    }
    public Mobile input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên điện thoại: ");
        String name = scanner.next();
        System.out.println("Nhập imei điện thoại: ");
        String imei = scanner.next();
        System.out.println("Nhập hãng điện thoại: ");
        String brand = scanner.next();
        System.out.println("Nhập giá điện thoại: ");
        int price = scanner.nextInt();
        System.out.println("Nhập màu điện thoại: ");
        String color = scanner.next();
        return new Mobile(imei, name, brand, price, color);
    }

    public void add(Mobile mobile) {
        mobiles.add(mobile);
    }

    public void display(ArrayList<Mobile> mobiles) {
        for (int i = 0; i < mobiles.size(); i++) {
            System.out.println(mobiles.get(i).toString());
        }
        System.out.println("----------------------------------");
    }

    public int checkByName(String name) {
        for (int i = 0; i < mobiles.size(); i++) {
            if (mobiles.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void editByName(String name) {
        int index = checkByName(name);
        if (index == -1) {
            System.out.println("Không có thông tin điện thoại cần sửa");
        } else
            mobiles.set(index, input());
    }

    public void deleteByName(String name) {
        if (checkByName(name) != -1) {
            mobiles.remove(checkByName(name));
        } else
            System.out.println("Không có thông tin điện thoại cần xóa");
    }
    public void searchByName(String name){
        for (int i = 0; i < mobiles.size(); i++){
            if (mobiles.get(i).getName().equals(name)){
                System.out.println(mobiles.get(i).toString());
            }
        }
    }
    public ArrayList<Mobile> searchByBrand1(String brand){
        ArrayList<Mobile> arrayBrand = new ArrayList<>();
        for (int i = 0; i < mobiles.size(); i++){
            if (mobiles.get(i).getBrand().equals(brand)){
                arrayBrand.add(mobiles.get(i));
            }
        }
        return arrayBrand;
    }
    public void searchByBrand(String brand) {
        for (int i = 0; i < mobiles.size(); i++) {
            if (mobiles.get(i).getBrand().equals(brand)) {
                System.out.println(mobiles.get(i).toString());
            }
        }
    }

    public void menu(){
        System.out.println("==========Menu==========");
        System.out.println("1. Thêm 1 điện thoại");
        System.out.println("2. Sửa thông tin 1 điện thoại");
        System.out.println("3. Xóa thông tin 1 điện thoại");
        System.out.println("4. Tìm thông tin 1 điện thoại");
        System.out.println("5. Sắp xếp điện thoại");
        System.out.println("6. Thoát chương trình");
    }
}