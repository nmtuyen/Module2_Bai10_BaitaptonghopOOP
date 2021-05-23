package fruitManagementByArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManagement fm = new FruitManagement();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            choice = fm.menu();
            switch (choice){
                case 1:
                    System.out.println("Nhập thông tin loại hoa quả muốn thêm");
                    fm.add(fm.input());
                    fm.display();
                    fm.menu();
                case 2:
                    System.out.println("Nhập tên loại quả cần sửa: ");
                    String name = scanner.next();
                    if (fm.check(name)!=-1){
                        fm.edit(name, fm.input());
                        fm.display();
                    }else{
                        System.out.println("không có loại quả cần sửa");
                        fm.display();
                    }
                    fm.menu();
                case 3:
                    System.out.println("Nhập tên loại quả cần xóa: ");
                    String name1 = scanner.next();
                    if (fm.check(name1)!=-1){
                        fm.delete(name1);
                        fm.display();
                    }else{
                        System.out.println("không có loại quả cần xóa");
                        fm.display();
                    }
                    fm.menu();
                case 4:
                    System.exit(0);
            }
        }while (choice<0 && choice>4);
    }

}
