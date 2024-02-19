package _07_Generic;

// 참고. Number 클래스
// - Java 에서 모든 숫자 형식의 부모 클래스
// - 정수형, 실수형 데이터 타입 모두 포함
// ex. Byte, Short, Integer, 등등

// 제네릭 제한 Case1
// - Box 클래스는 제네릭 타입 T를 받지만 제한을 두어 Number 를 상속한 클래스만 허용
class Box<T extends Number>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

// 제네릭 제한
// 타입을 직접 제한
// Movable 인터페이스
interface Movable{
    void move();
}
// Movable 인터페이스를 구현하는 Car 클리스
class Car implements Movable{

    @Override
    public void move() {
        System.out.println("자동차 출발!");
    }
}

// Case2
// Container 클래스는 제네릭 타입 T를 받지만 제한을 두어 Movable 인터페이스를 구현한 클래스만 허용
// - makeItMove 메서드는 해당 객체의 move 메서드를 호출하게 되는 경우

class Container<T extends Movable>{
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public void makeItMove(){
        item.move();
    }
}
public class GenericEx2 {
    public static void main(String[] args) {
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(3.14);
        System.out.println(doubleBox.getItem());

        // X : 제네릭 타입에 Number 를 상속받지 않는 타입을 사용하는 경우
        // Box<String> stringBox = new Box<String>(); // Number 형식이 아니라 컴파일 에러
        // stringBox.setItem("Hello World");

        //////////////////////////////////////////////////
        Container<Car> container = new Container<>(new Car());
        container.makeItMove();

    }
}
