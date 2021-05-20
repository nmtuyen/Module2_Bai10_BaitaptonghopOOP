package managerEngineer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ManagerEngineer {
    ArrayList<Engineer> engineers;

    public ManagerEngineer() {
        engineers = new ArrayList<>();
    }
    public void display(){
        for (int i = 0; i < engineers.size(); i++){
            System.out.println(engineers.get(i).toString());
        }
        System.out.println("------------------------------------------------");
    }
    public void add(Engineer engineer){
        engineers.add(engineer);
    }
    public int searchByName(String name){
        for (int i = 0; i < engineers.size(); i++){
            if (engineers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public int searchByAge(int age){
        for (int i = 0; i < engineers.size(); i++){
            if (age == engineers.get(i).getAge()){
                return i;
            }
        }
        return -1;
    }

    public void deleteByAge(int age){
        int index = searchByAge(age);
        if (index == -1){
            System.out.println("Không có kỹ sư cần chém :)))))");
        }else
            engineers.remove(index);
    }
    public void edit(String name, Engineer engineer){
        int index = searchByName(name);
        if (index == -1){
            System.out.println("Không có đối tượng cần sửa");
        }else {
            engineers.set(index, engineer);
        }
    }
    public void sortByAge(){
        Collections.sort(this.engineers);
    }

}
