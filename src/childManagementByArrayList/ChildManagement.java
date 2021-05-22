package childManagementByArrayList;

import java.util.ArrayList;

public class ChildManagement {
    ArrayList<Child> children;

    public ChildManagement(){
        children = new ArrayList<>();
    }
    public void add(Child child){
        children.add(child);
    }
    public void display(){
        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i).toString());
        }
        System.out.println("------------------------------------");
    }
    public boolean check(String name){
        for (int i = 0; i < children.size(); i++){
            if (children.get(i).getName().equals(name)){
                return true;
            }
        }return false;
    }
    public int search(String name){
        for (int i = 0; i < children.size(); i++){
            if (children.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public void delete(String name){
        if (check(name)){
            children.remove(search(name));
        }else
            System.out.println("Không tim thấy thông tin đứa trẻ cần xóa");
    }
    public void edit(String name, Child child){
        int index = search(name);
        if (index == -1){
            System.out.println("Không thông tin bé cần sửa");
        }else
            children.set(index, child);
    }
}
