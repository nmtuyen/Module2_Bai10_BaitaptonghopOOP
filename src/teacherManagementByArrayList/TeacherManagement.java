package teacherManagementByArrayList;

import java.util.ArrayList;

public class TeacherManagement {
    ArrayList<Teacher> teachers;

    public TeacherManagement() {
        teachers = new ArrayList<>();
        teachers.add(new Teacher("abc", 28, "Hà Nội", "123", 5000, 750, 250));
        teachers.add(new Teacher("def", 25, "HD", "456", 7000, 550, 200));
        teachers.add(new Teacher("ghui", 29, "QN", "789", 6000, 850, 150));
    }
    public void displayTeacher(){
        for (int i = 0; i < teachers.size(); i++){
            System.out.println(teachers.get(i).toString());
        }
        System.out.println("------------------------------");
    }
    public int checkTeacher(String id){
        for (int i =0; i < teachers.size(); i++){
            if (teachers.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void deleteTeacher(String id){
        if (checkTeacher(id)!=-1){
            teachers.remove(checkTeacher(id));
        }else
            System.out.println("Không có thông tin giáo viên muốn xóa");
    }
    public void calculatorRealSalary(){
        int [] realSalary = new int[teachers.size()];
        for (int i = 0; i < teachers.size(); i++){
            realSalary[i] = teachers.get(i).getSalary()+teachers.get(i).getBonusSalary()-teachers.get(i).getPenaltySalary();
        }
        for (int j = 0; j < realSalary.length; j++){
            System.out.println(realSalary[j]+" ");
        }
    }
}
