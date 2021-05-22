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
            System.out.println("5. Thoát chương trình");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    int soluong;
                    System.out.println("Nhập số lượng laptop muốn thêm");
                    soluong = scanner.nextInt();
                    for (int i = 0; i< soluong; i++){
                        String idAdd;
                        System.out.println("Nhập Id laptop cần thêm");
                        idAdd = scanner.next();
                        lm.add(idAdd, lm.input());
                        lm.display();
                    }
                    break;
                case 2:
                    int soluong2;
                    System.out.println("Nhập danh sách");
                    System.out.println("Nhập số lượng laptop trong danh sách");
                    soluong2 = scanner.nextInt();
                    for (int i = 0; i< soluong2; i++){
                        String idAdd;
                        System.out.println("Nhập ID laptop");
                        idAdd = scanner.next();
                        lm.add(idAdd, lm.input());
                        lm.display();
                    }
                    System.out.print("Nhập id laptop muốn sửa: ");
                    String ID = scanner.next();
                    if (lm.check(ID)){
//                    System.out.println("Nhập ID laptop");
//                    String laptopID1 = scanner.next();
//                    System.out.println("Nhập hãng laptop");
//                    String brand1 = scanner.next();
//                    System.out.println("Nhập giá laptop");
//                    int price1 = scanner.nextInt();
//                    System.out.println("Nhập năm sản xuất laptop");
//                    int year1 = scanner.nextInt();
//                    System.out.println("Nhập kích thước màn hình laptop");
//                    int screenSize1 = scanner.nextInt();
                        lm.add(lm.input().getLaptopID(), lm.input());
                    }
                    lm.display();
                case 3:
                    int soluong3;
                    System.out.println("Danh sách laptop");
                    System.out.println("Nhập số lượng laptop trong danh sách");
                    soluong3 = scanner.nextInt();
                    for (int i = 0; i< soluong3; i++){
                        String idAdd;
                        System.out.println("Nhập danh sách laptop");
                        idAdd = scanner.next();
                        lm.add(idAdd, lm.input());
                        lm.display();
                    }
                    String idDel;
                    System.out.println("Nhập ID laptop muốn xóa");
                    idDel = scanner.next();
                    lm.delete(idDel);
                case 4:
                    int soluong4;
                    System.out.println("Nhập số lượng laptop muốn thêm");
                    soluong4 = scanner.nextInt();
                    for (int i = 0; i< soluong4; i++) {
                        String idAdd;
                        System.out.println("Nhập Id laptop cần thêm");
                        idAdd = scanner.next();
                        lm.add(idAdd, lm.input());
                        lm.display();
                    }
                    lm.sort();
                    lm.display();
                case 5:
                    System.exit(0);
            }
        }while (choice < 0 || choice > 5 );

    }
}
