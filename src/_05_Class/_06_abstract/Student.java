package _05_Class._06_abstract;

public abstract class Student {
    private String name;
    private String School;
    private int age;
    private int number;

    public String getName() {
        return name;
    }

    public String getSchool() {
        return School;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public Student(String name, String School, int age, int number){
        this.name = name;
        this.School = School;
        this.age = age;
        this.number = number;
    }
    abstract void todo();

}
