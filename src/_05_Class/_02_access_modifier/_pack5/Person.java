package _05_Class._02_access_modifier._pack5;

public class Person {
    private int age;
    private String name;

    public Person(String name){
        // this 라고 넣는 이유는 받는 매개 변수가 name 이라고 이름이 같기 때문에 붙인거다.
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        // this.age = age;
        if (age < 0){
            this.age = 0;
//            return;
        }else{
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
