package _05_Class._06_abstract;

import java.util.ArrayList;

public class ShapeEX {
    public static void main(String[] args) {
        // Shape 객체는 new 연산자로 직접 생성할 수 없지만,
        // 자식 클래스인 Circle, Square 에서 new 연산자로 객체 생성 가능

//        Shape shape = new Shape(); X 사용 불가

        Circle circle = new Circle("red", "Circle", 5);
        Square square = new Square("blue", "Square", 10, 20);

//        circle.start();
//        circle.draw();

        // ArrayList 생성
        // Shape -> Circle, Square 의 부모 이기 때문에
        // 자바의 다형성 - 하나의 변수기 여러 종류의 객체를 참조할 수 있는 능력
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(square);
        for (Shape S : shapes) {
            System.out.println(S.getColor());
            System.out.println(S.getType());
            System.out.println(S.calculateArea());

//        square.start();
//        square.draw();
//        ArrayList<Shape> squares = new ArrayList<>();
//        squares.add(square);
//        for (Square S: squares){
//            System.out.println(S.getColor());
//            System.out.println(S.getType());
//            S.calculateArea();
//        }

        }
    }
}
