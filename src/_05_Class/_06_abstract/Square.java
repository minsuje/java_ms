package _05_Class._06_abstract;

// 구체적인 클래스
public class Square extends Shape{
    private int width;
    private int height;

    public Square(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    // 추상 메사드 구현
    void draw(){
        System.out.println("사각형 그리기");
    }

//    @Override
    public double calculateArea() {
//        System.out.println("사각형의 넓이 : " + width * height);
        return width * height;
    }

//    @Override
//    void calculateArea(int radius) {
//    }
//
//    @Override
//    void calculateArea(int width, int height){
//        System.out.println("사각형의 넓이 : " + width * height);
//    }
}
