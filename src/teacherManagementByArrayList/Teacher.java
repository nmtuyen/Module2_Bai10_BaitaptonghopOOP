package teacherManagementByArrayList;

public class Teacher {
    private String name;
    private int age;
    private String country;
    private String id;
    private int salary;
    private int bonusSalary;
    private int penaltySalary;

    public Teacher(String name, int age, String country, String id, int salary, int bonusSalary, int penaltySalary) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.id = id;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.penaltySalary = penaltySalary;
    }

    public Teacher() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getPenaltySalary() {
        return penaltySalary;
    }

    public void setPenaltySalary(int penaltySalary) {
        this.penaltySalary = penaltySalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                ", penaltySalary=" + penaltySalary +
                '}';
    }
}
