package _05_Class._02_access_modifier._pack3;

// 필드와 메소드의 접근 제한자 ( 접근 제어 )
public class A {
    public int field1; // public field
    int field2; // default field
    private int field3; // private field

    // constructor (생성자)
    public A(){
        // 클래스 내부이므로 접근 제한자의 영향을 받지 않음, 모든 것에 접근 가능
        field1 = 1;
        field2 = 2;
        field3 = 3;

        method1();
        method2();
        method3();
    }

    // public
    public void method1(){
    }
    // default
    void method2(){
    }
    // private
    private void method3(){}
}
