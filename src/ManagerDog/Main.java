package ManagerDog;

import ManagerDog.Dog;
import ManagerDog.DogManager;

public class Main {
    public static void main(String[] args) {
        DogManager dm = new DogManager();
        dm.add(new Dog("Lu", 15, false, "black", 1));
        dm.add(new Dog("Mic", 10, true, "brown", 2));
        dm.add(new Dog("Ki", 12, true, "brown", 4));
        dm.add(new Dog("Ki", 11, true, "brown", 5));
        dm.add(new Dog("Ki", 10, true, "brown", 1));
        dm.Display();
        dm.Search(10);
        dm.Delete(10);
        dm.Display();
    }
}
