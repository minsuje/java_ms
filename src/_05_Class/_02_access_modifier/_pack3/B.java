package _05_Class._02_access_modifier._pack3;

public class B {
    public void method(){
        A a = new A(); // _pack3.A 와 _pack3.B 서로 같은 패키지

        // 필드 변경 (필드 접근)
        // field3 는 private 이라 접근 불가, 컴파일 에러
        a.field1 = 1; // o
        a.field2 = 2; // o
        // a.field3 = 3; // X

        // 메서드 호출
        // method3()는 private method 라 접근이 불가능 하다.
        a.method1(); // o
        a.method2(); // o
        // a.method3(); // x

    }
}
