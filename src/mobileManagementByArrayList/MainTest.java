package mobileManagementByArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ManageMobile mb = new ManageMobile();
        Scanner sc = new Scanner(System.in);
        System.out.println("List điện thoại của cửa hàng là: ");
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
                    System.out.println("3. Tìm kiếm theo khoảng giá");
                    int choice2;
                    choice2 = sc.nextInt();
                    while (true) {
                        switch (choice2) {
                            case 1:
                                System.out.println("Nhập tên muốn tìm");
                                String name2 = sc.next();
                                if (mb.searchByName(name2).size() == 0){
                                    System.out.println("Không có thông tin điện thoại bạ muốn tìm");
                                }else{
                                    System.out.println("Điện thoại bạn muốn tìm là");
                                    mb.display(mb.searchByName(name2));
                                }

                                break;
                            case 2:
                                System.out.println("Nhập hãng muốn tìm");
                                String brand = sc.next();
                                mb.display(mb.searchByBrand1(brand));
                                break;
                            case 3:
                                System.out.println("Nhập khoảng giá điện thoại muốn tìm");
                                System.out.println("Nhập khoảng giá thấp nhất");
                                int minPrice = sc.nextInt();
                                System.out.println("Nhập khoảng giá cao nhất");
                                int maxPrice = sc.nextInt();
                                if (mb.searchByPrice(minPrice,maxPrice).size() == 0){
                                    System.out.println("Không có điện thoại trong khoảng giá bạn nhập");
                                }else{
                                    System.out.println("List điện thoại trong khoảng giá bạn muốn tìm là");
                                    mb.display(mb.searchByPrice(minPrice,maxPrice));
                                }
                                break;
                        }
                        break;
                    }
                case 5:
                    mb.sortPriceUp();
                    mb.display(mb.mobiles);
                    break;
                case 6:
                    mb.sortPriceDown();
                    mb.display(mb.mobiles);
                    break;
                case 7:
                    mb.sortByName();
                    mb.display(mb.mobiles);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }
}
