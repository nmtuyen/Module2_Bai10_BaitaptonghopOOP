public class Dog {
    private String name;
    private double weigth;
    private boolean gender;
    private String color;
    private int age;

    public Dog(String name, double weigth, boolean gender, String color, int age) {
        this.name = name;
        this.weigth = weigth;
        this.gender = gender;
        this.color = color;
        this.age = age;
    }
    public Dog(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name: '" + name + '\'' +
                ", weigth=" + weigth +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
