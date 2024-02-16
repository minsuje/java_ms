package _05_Class._04_final;

import java.util.Scanner;

public class FinalPrac {
    private static final double PI = Math.PI;

    private final double radius;

    public FinalPrac(double radius){
        this.radius = radius;
    }

    public double result(){
        return (radius * radius) * PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원의 반지름을 입력하세요 : ");
        int number = scanner.nextInt();

        FinalPrac redius1 = new FinalPrac(number);
        System.out.println("원의 반지름 : " + redius1.radius);
        System.out.println("원의 넓이 : " + redius1.result());
    }
}
