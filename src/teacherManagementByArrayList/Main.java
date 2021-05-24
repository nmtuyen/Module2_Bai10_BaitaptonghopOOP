package teacherManagementByArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TeacherManagement tm = new TeacherManagement();
        tm.displayTeacher();
        tm.addTeacher(new Teacher("A", 30, "TH", "147", 8000, 950, 150));
        tm.displayTeacher();
        tm.deleteTeacher("123");
        tm.displayTeacher();
        tm.calculatorRealSalary();
    }
}
