package _02_control_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// 즉, 이름이 같고 메개변수가 타입, 개수, 순서가 다른 경우
// - 동작이 유사할 때 사용하면 편리
public class MethodOverloading {
    public static void main(String[] args) {

        // static 이 있으면 객체의 생성 없이도 사용 가능, 없다면 따로 생성 해줘야 한다.
        // 객체란 우리가 만들지 않으면 없는거다. 만들어야 메모리에 생성.
        // static 을 만들면 클래스 내에 static 으로 만든 것에 대한 공간이 미리 생긴다. 그래서 만들지 않아도 이미 있는 거다( 이미 주소를 차지하고 있다.)
        // 클래스 안에서 공유한다면 보통 static 을 붙인다.

        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체의 메서드 사용
        System.out.println(ol.add(10,20));
        System.out.println(ol.add(10.1, 20.2));
        System.out.println(ol.add(10, 20, 30));
        System.out.println(ol.add(10.1, 20.1, 30.1));

    }
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, double b, double c){
        return a + b + c;
    }
}
