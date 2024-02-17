package _05_Class._05_inheritance;

public class StudentEx {
    public static void main(String[] args) {

        Student std1 = new Student("정코딩",20);

        /*
        // Case 1. 부모, 자식 클래스의 필드가 public 인 경우
        // Person(부모) 클래스로부터 상속 받은 필드 값 읽기
        System.out.println(std1.age);
        System.out.println(std1.name);

        // 자식 클래스 필드 값 읽기
        std1.setCampus("코딩"); // Student 메서드 호출
        System.out.println(std1.campus);

        // Person 으로 부터 상속 받은 메소드 호출
        std1.say();
        std1.eat("바나나");

         */

        // ===========================================

        // case 2. 부모 , 자식 클래스의 필드가 private 인 경우

        // Person(부모) 클래스로부터 상속 받은 필드 값 읽기
        System.out.println(std1.getAge());
        System.out.println(std1.getName());

        // 자식 클래스 필드 값 읽기
        std1.setCampus("코딩"); // Student 메서드 호출
        System.out.println(std1.getCampus());

        // Person 으로 부터 상속 받은 메소드 호출
        std1.say(); // public 메서드
        std1.eat("바나나");
    }
}
