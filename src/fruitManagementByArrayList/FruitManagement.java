package fruitManagementByArrayList;

import java.util.ArrayList;

public class FruitManagement {
    ArrayList<Fruit> fruits;

    public FruitManagement() {
        fruits = new ArrayList<>();
        fruits.add(new Fruit("cucumber", 15000, "green"));
        fruits.add(new Fruit("strawberry", 28000, "pink"));
        fruits.add(new Fruit("banana", 19000, "yellow"));
        fruits.add(new Fruit("watermelon", 25000, "green"));
        fruits.add(new Fruit("apple", 45000, "red"));

    }
    public void add(Fruit fruit){
        fruits.add(fruit);
    }
    public void display(){
        for (int i = 0; i < fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        System.out.println("======================================");
    }
    public int check(String name){
        for (int i = 0; i < fruits.size(); i++){
            if (fruits.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    public void edit(String name, Fruit fruit){
        if (check(name)!=-1){
            fruits.set(check(name), fruit);
        }else
            System.out.println("Không có thông tin loại quả cần sửa");
    }
    public void delete(String name){
        if (check(name)!=-1){
            fruits.remove(check(name));
        }else
            System.out.println("không có loại quả cần xóa");
    }
}
