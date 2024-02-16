package _05_Class._02_access_modifier._pack4;

import _05_Class._02_access_modifier._pack3.A;

public class C {
    public void method(){
        A a = new A(); // _pack3.A 와 _pack4.C 서로 다른 패키지 => import 가 생긴다.

        // 필드 변경 (필드 접근)
        // field3 는 private 이라 접근 불가, 컴파일 에러
        // field2 는 default 필드라 다른 패키지에서 접근 불가, 컴파일 에러
        a.field1 = 1; // o
        // a.field2 = 2; // x
        // a.field3 = 3; // X

        // 메서드 호출
        // method3()는 private method 라 접근이 불가능 하다. 컴파일 에러
        // method2()는 default method 라 다른 패키지에서 접근이 불가, 컴파일 에러
        a.method1(); // o
        // a.method2(); // x
        // a.method3(); // x

    }
}
