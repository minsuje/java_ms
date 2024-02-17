package _05_Class._06_abstract;

// 구체적인 클래스
public class Circle extends Shape{
    private int radius;

    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    // 추상 메사드 구현
    void draw(){
        System.out.println("원 그리기");
    }

    public double calculateArea() {
//        System.out.println("원의 넓이 : " + (radius * radius) * Math.PI);
        return (radius * radius) * Math.PI;
    }

}
