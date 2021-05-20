import java.util.ArrayList;
import java.util.Scanner;

public class DogManager {
    ArrayList<Dog> dogs;

    public DogManager(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }
    public DogManager(){
        dogs = new ArrayList<>();
    }
    public void Display(){
        for (int i = 0; i < dogs.size(); i++){
                System.out.println(dogs.get(i).toString());
        }
        System.out.println("===========================================");
    }
    public void add(Dog dog){
       dogs.add(dog);
    }
    public void Seach(double weight){
        for (int i = 0; i < dogs.size(); i++){
            if (weight == dogs.get(i).getWeigth()){
                System.out.println(dogs.get(i));
            }
        }
    }
    public void Edit(){

    }
}
