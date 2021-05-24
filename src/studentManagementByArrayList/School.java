package studentManagementByArrayList;

import java.util.ArrayList;

public class School {
    ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
        students.add(new Student("Nam", 23, "DN"));
        students.add(new Student("abc", 20, "DN"));
        students.add(new Student("def", 20, "DN"));
        students.add(new Student("ghi", 23, "DN"));
    }
    public void display(){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).toString());
        }
        System.out.println("------------------------------------");
    }
    public void add(Student student){
        students.add(student);
    }
    public void display20YearOld(){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getAge()==20){
                System.out.println(students.get(i).toString());
            }
        }
    }
    public int count23YearOldDN(){
        int count = 0;
        for (int i =0; i < students.size(); i++){
            if (students.get(i).getAge()==23 && students.get(i).getCountry().equals("DN")){
                count++;
            }
        }
        return count;
    }
}
