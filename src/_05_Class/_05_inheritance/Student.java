package _05_Class._05_inheritance;

public class Student extends Person {
    /*
    // Case 1. 필드가 Public 인 경우
    public String campus;

    public Student(String name, int age){
        // 2-1. 부모 클래스가 기본 생성자
        // super(); // 생략 되어있음( 컴파일 시 자동 추가 )
//        this.name = name;
//        this.age = age;

        // 2-2. 부모 클래스가 매개변수를 갖는 생성자
        super(name, age);

    }

    public void setCampus(String campus){
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부중");
    }

     */

    // ==============================================

    // case 2. (부모)필드가 private 인 경우
    private String campus;
    public Student(String name, int age){
        // this.name = name; // private 이기 때문에 this 가 안된다.
        // 해결법
        // 부모로부터 상속 받은 필드 => seter
        setAge(age);
        setName(name);
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
        System.out.println(campus + "캠퍼스에서 공부중");
    }

    // ===================================================

    // 오버 라이딩 - 부모 클래스의 메서드를 자식 클래스에서 재정의
    // 메소드 이름, 매개변수 타입 및 개수, 리던 타입 등 모든 것 동일하게

    @Override // 어노테이션 ( 생략 사능하다 ) , 컴파일 상에서 컴퓨터에게 알려준다.
    public void say() {
        System.out.println("안녕 반가워!");
    }
}
