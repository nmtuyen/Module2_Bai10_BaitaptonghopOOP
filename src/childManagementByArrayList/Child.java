package childManagementByArrayList;

public class Child {
    public String name;
    public int age;
    public boolean gender;
    public String address;

    public Child() {
    }

    public Child(String name, int age, boolean gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name:'" + name + '\'' +
                ", age:" + age +
                ", gender:" + gender +
                ", address:'" + address + '\'' +
                '}';
    }
}
