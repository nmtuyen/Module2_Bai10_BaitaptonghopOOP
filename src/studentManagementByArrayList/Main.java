package studentManagementByArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.display();
        school.display20YearOld();
        school.count23YearOldDN();
        System.out.println(school.count23YearOldDN());
    }
}
