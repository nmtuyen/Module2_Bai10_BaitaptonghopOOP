package laptopManagement;

import java.util.*;

public class LaptopManager {
    Map<String, Laptop> laptops;

    public LaptopManager() {
        laptops = new HashMap<>();
    }
    public void add(String laptopID, Laptop laptop){
        laptops.put(laptopID, laptop);
    }
    public void display(){
        Set<String> keys = laptops.keySet();
        for (String key: keys) {
            System.out.println("key"+ key+":" + laptops.get(key));
        }
        System.out.println("----------------------------------");
    }
    public boolean check(String laptopID){
        if (laptops.containsKey(laptopID))
            return true;
        return false;
    }
    public void edit(String laptopID, Laptop laptop){
        if (check(laptopID)){
            laptops.put(laptopID, laptop);
        }else
            System.out.println("Không có thông tin laptop cần thay đổi");
    }
    public void delete(String laptopID){
        if (check(laptopID)){
            laptops.remove(laptopID);
        }else
            System.out.println("Không có laptop cần xóa");
    }
    public void sort(){
        List<Map.Entry<String, Laptop>> list = new LinkedList<>(laptops.entrySet());
        Object a = laptops.entrySet();
        Collections.sort(list, new Comparator<Map.Entry<String, Laptop>>() {
            @Override
            public int compare(Map.Entry<String, Laptop> o1, Map.Entry<String, Laptop> o2) {
                return 0;
            }
        });
    }
}

