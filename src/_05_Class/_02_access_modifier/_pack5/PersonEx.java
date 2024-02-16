package _05_Class._02_access_modifier._pack5;

// 하나의 소스파일에는 하나의 클래스만 만드는게 좋다. ( 클래스가 여러 개 있을 때, 컴퓨터가 컴파일 할 때 out 폴더에 보면은 두개로 나누어져 있다.)
// .class 라는 여러개의 파일로 나누어 진다. (로컬 폴더에서)

public class PersonEx {
    public static void main(String[] args) {
        // 객체 생성
        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");

        // 필드 직접 변경 불가
        // p1.age = 4; // private 이라 컴파일 에러

        p1.setAge(4); // O : 메서드를 이용한 간접적 변경 가능
        System.out.println(p1.getName() + "의 나이 : " + p1.getAge());

        p2.setAge(-2); // 음수 값이 들어오면, setAge 내부 로직으로 의해 0으로 변경
        System.out.println(p2.getName() + "의 나이 : " + p2.getAge());
    }
}
