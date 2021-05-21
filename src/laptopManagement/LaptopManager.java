package laptopManagement;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
            System.out.println("Key: "+key+":"+laptops.get(key));
        }
        System.out.println("----------------------------------");
    }
    public boolean check(String laptopID){
        if (laptops.containsKey(laptopID))
            return true;
        return false;
    }

}

