package _05_Class._01_class;

public class ClassName {
    //필드(변수)
    public int number;
    public String name;

    // 메소드 (함수)

    // 생성자 -> 클래스명과 동일한 이름
    // 기본 생성자 (default) 생략 가능
//    public ClassName() {
//
//    }

    public ClassName(int number, String name){
        this.name = name;
        this.number = number;
    }

    public void testMethod(){
        System.out.println("test method");
    }

    public static void main(String[] args) {
        // 객체 생성 (인스턴스 화)
        ClassName test = new ClassName(30, "min"); // 주소값이 반환되어 test 에 담긴다.

        // 필드, 메서드 사용
        test.testMethod();
        System.out.println(test.name); // null
        System.out.println(test.number); // 0



    }
}
