package laptopManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopManager lm = new LaptopManager();
        Scanner scanner = new Scanner(System.in);
        int i = 0;
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
            i = scanner.nextInt();
        }while (i < 0 || i > 5 );
        switch (i){
            case 1:
                System.out.println("Enter thông tin laptop mới");
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập ID laptop");
                String laptopID = sc.next();
                System.out.println("Nhập hãng laptop");
                String brand = sc.next();
                System.out.println("Nhập giá laptop");
                int price = sc.nextInt();
                System.out.println("Nhập năm sản xuất laptop");
                int year = sc.nextInt();
                System.out.println("Nhập kích thước màn hình laptop");
                int screenSize = sc.nextInt();
                lm.add(laptopID, new Laptop(laptopID, brand, price, year, screenSize));
                lm.display();
            case 2:
                String ID = scanner.next();
                if (lm.check(ID)){

                }
        }
    }
}
