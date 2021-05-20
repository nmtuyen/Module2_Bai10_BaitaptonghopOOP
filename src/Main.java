public class Main {
    public static void main(String[] args) {
        DogManager dm = new DogManager();
        dm.add(new Dog("Lu", 15, false, "black", 1));
        dm.add(new Dog("Ki", 10, true, "brown", 2));
        dm.Display();
        dm.Seach(10);
    }
}
