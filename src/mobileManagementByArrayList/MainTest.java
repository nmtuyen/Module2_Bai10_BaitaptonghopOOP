package mobileManagementByArrayList;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ManageMobile mb = new ManageMobile();
        Scanner sc = new Scanner(System.in);
        mb.display(mb.mobiles);
        while (true) {
            mb.menu();
            System.out.print("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập thông tin điện thoại muốn thêm");
                    mb.add(mb.input());
                    mb.display(mb.mobiles);
                    break;
                case 2:
                    System.out.println("Nhập tên điện thoại muốn sửa");
                    String name = sc.next();
                    mb.editByName(name);
                    mb.display(mb.mobiles);
                    break;
                case 3:
                    System.out.println("Nhập tên điện thoại muốn xóa");
                    String name1 = sc.next();
                    mb.deleteByName(name1);
                    mb.display(mb.mobiles);
                    break;
                case 4:
                    System.out.println("1. Tìm theo tên");
                    System.out.println("2. Tìm theo hãng");
                    int choice2;
                    choice2 = sc.nextInt();
                    while (true) {
                        switch (choice2) {
                            case 1:
                                System.out.println("Nhập tên muốn tìm");
                                String name2 = sc.next();
                                mb.searchByName(name2);
                                break;
                            case 2:
                                System.out.println("Nhập hãng muốn tìm");
                                String brand = sc.next();
                                mb.display(mb.searchByBrand1(brand));
                                break;
                        }
                        break;
                    }
            }
        }
    }
}
