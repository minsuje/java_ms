package _05_Class._04_final;

public class Student {
    // final 필드
    final String name = "초기화"; // 1. 필드 선언 시 초기화

    // 2. 생성자에서 초기화
    final String sid;
    public Student(String sid){
        this.sid = sid;
    }

    public static void main(String[] args) {
        Student student1 = new Student("s0001");
        System.out.println(student1.name);
        System.out.println(student1.sid);

        //final 필드 값 변경 불가능
//        student1.name = "홍길동";
//        student1.sid = "29201";
    }

}
