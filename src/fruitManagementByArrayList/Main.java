package fruitManagementByArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManagement fm = new FruitManagement();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Thêm 1 loại quả");
            System.out.println("2. Sửa thông tin 1 loại quả");
            System.out.println("3. Xóa loại quả không bán nữa");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.print("Nhập lệnh muốn thực hiện: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:

                    fm.add();
            }
        }while (choice<0 && choice>4);
    }

}
