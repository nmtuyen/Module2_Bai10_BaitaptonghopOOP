package managerEngineer;

public class Main {
    public static void main(String[] args) {
        ManagerEngineer me = new ManagerEngineer();
        me.add(new Engineer("Nam", 25, "nam", "Hà Nội"));
        me.add(new Engineer("Chiến", 20, "nam", "Hải Phòng"));
        me.add(new Engineer("Minh", 28, "nam", "Nam Định"));
        me.add(new Engineer("Chương", 26, "nam", "Bắc Ninh"));
        me.add(new Engineer("Phong", 21, "nam", "Bắc Giang"));
        me.add(new Engineer("Tú", 23, "nam", "Hải Dương"));
        me.display();
        System.out.println(me.searchByName("Chương"));
        me.deleteByAge(28);
        me.display();
        me.edit("Phong", new Engineer("Phong cc", 25, "nam", "Quất Lâm"));
        me.display();
        me.sortByAge();
        me.display();
    }
}
