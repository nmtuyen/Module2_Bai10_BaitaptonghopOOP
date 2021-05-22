package childManagementByArrayList;

public class Main {
    public static void main(String[] args) {
        ChildManagement childManagement = new ChildManagement();
        childManagement.add(new Child("Nam", 5, true, "Long Biên"));
        childManagement.add(new Child("Mai", 5, false, "Cầu Giấy"));
        childManagement.add(new Child("Ngọc", 5, false, "Hai Bà Trưng"));
        childManagement.add(new Child("Chương", 5, true, "Long Biên"));
        childManagement.add(new Child("Hiền", 5, false, "Từ Liêm"));
        childManagement.add(new Child("Phong", 5, true, "Đông Anh"));
        childManagement.display();
        childManagement.delete("Phong");
        childManagement.display();
        childManagement.edit("Chương", new Child("ChươngCC", 5, true, "Long Biên"));
        childManagement.display();
    }
}
