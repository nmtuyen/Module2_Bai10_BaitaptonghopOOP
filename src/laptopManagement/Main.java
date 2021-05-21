package laptopManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopManager lm = new LaptopManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("=========Menu=========");
            System.out.println("1. Thêm 1 laptop mới");
            System.out.println("2. Sửa thông tin 1 laptop");
            System.out.println("3. Xóa 1 laptop");
            System.out.println("4. Sắp xếp laptop");
//                System.out.println("4.1 Sắp xếp laptop theo giá");
//                System.out.println("4.2 Sắp xếp laptop theo hãng");
//                System.out.println("4.3 Sắp xếp laptop theo năm sản xuất");
            System.out.println("5. Thoát chương trình");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
        }while (choice < 0 || choice > 5 );
        switch (choice){
            case 1:
                System.out.println("Nhập ID laptop");
                String laptopID = scanner.next();
                System.out.println("Nhập hãng laptop");
                String brand = scanner.next();
                System.out.println("Nhập giá laptop");
                int price = scanner.nextInt();
                System.out.println("Nhập năm sản xuất laptop");
                int year = scanner.nextInt();
                System.out.println("Nhập kích thước màn hình laptop");
                int screenSize = scanner.nextInt();
                lm.add(laptopID, new Laptop(laptopID, brand, price, year,screenSize));
                lm.display();
                break;
            case 2:
                String ID = scanner.next();
                if (lm.check(ID)){
                    System.out.println("Nhập ID laptop");
                    String laptopID1 = scanner.next();
                    System.out.println("Nhập hãng laptop");
                    String brand1 = scanner.next();
                    System.out.println("Nhập giá laptop");
                    int price1 = scanner.nextInt();
                    System.out.println("Nhập năm sản xuất laptop");
                    int year1 = scanner.nextInt();
                    System.out.println("Nhập kích thước màn hình laptop");
                    int screenSize1 = scanner.nextInt();
                    lm.add(ID, new Laptop(laptopID1, brand1, price1, year1, screenSize1));
                }
                lm.display();
        }
    }
}
