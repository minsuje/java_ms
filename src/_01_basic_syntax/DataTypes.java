package _01_basic_syntax;

public class DataTypes {
    public static void main(String[] args) {
        // 식별자
        char name; // 0
        int name2; // 숫자 사용 가능
//        int 4name; // 단, 맨 앞 숫자 불가능
//        char for; // 예약어 지정 불가
        char student_ID$; // 특수 기호는 _ , $ 만 가능하다.

        // 기본형 Primitive Type
        // - 사용 되기전에 선언이 되어야 한다.
        // - os에 따라서 자료형 길이가 변하지 않음
        // - "비 객체" 타입 => null 값 가질 수 없음
        System.out.println("================ 기본형 ===============");
        // 정수형 변수 선언
        int x = 10;
        long y = 10000000L; // long 타입은 뒤에 "l" or "L" 을 붙여줘야 한다.
        short z = 3456;
        byte b = 123;

        // 실수형 변수
        float a = 3.14f; // float 타입은 뒤에 'f' or "F" 붙여줘야 함
        double c = 2.4321;

        // 문자형 변수 선언
        char ch = 'a';

        // 논리형 변수 선언
        boolean bool = true;

        // 변수 출력
        System.out.println("정수형 변수 출력 : " + x + ',' + y + ',' + z + ',' + b);
        System.out.println("실수형 변수 출력 : " + a + ',' + c );
        System.out.println("문자형 변수 출력 : " + ch);
        System.out.println("논리형 변수 출력 : " + bool);

        // ============================================================================

        // 참조형 Reference Type
        // - java.lang.Object 상속 받음
        // - 기본형이 아니면 모두 참조형

        System.out.println("=========== 참조형 =============");

        // String 참조형 변수 선언과 초기화
        // - Java에서 String 타입은 특별함. 참조형 이지만 기본형처럼 사용(불변 객체)
        // - 기본 자료형은 "==" 비교연산자 사용, String 객체간의 비교연산자 .equals() 메소드 사용

        String greeting = "Hello, World!";

        // 배열 (Array) 참조형 변수 선언과 초기화
        int[] nums = {1,2,3,4,5};

        // 클래스 (class) 참조형 변수 선언과 초기화
        Person person = new Person("Jhon", 20);
        System.out.println(person.getAge());

        // 출력
        System.out.println("String 변수 : " + greeting);

        // 배열 ver. 일반 for 문
        System.out.println("배열 변수 :");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }

        // ver. for-each 문
        for (int num: nums){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Person 클래스 객체 :" + person.getName() + ", " + person.getAge());
    }
}

// 클래스
class Person {
    String name;
    int age;

    // 클래스 이름과 동일하게 만든다. 초기화
    public Person(String name, int age){ // 생성자 메서드, 클래스가 객체를 만들 때 자동으로 실행 됨
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public  int getAge(){
        return age;
    }

}