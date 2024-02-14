package _02_control_statement;

import java.util.Scanner;

public class prac_14_02 {

    public static void main(String[] args) {
//        System.out.println("숫자를 입력하세요 >>> ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        for (int i = 1; i <= num ; i++) {
//            System.out.print(i + " ");
//        }

        System.out.println("숫자를 두 개 입력하세요");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("덧셈 결과 = " + (num1 + num2));
        System.out.println("뺄셈 결과 = " + (num1 - num2));
        System.out.println("나눗셈 결과 = " + (num1 / num2));
        System.out.println("곱셈 결과 = " + (num1 * num2));

        System.out.println("반지름이 5인 원의 넓이 = " + result(Math.PI, 5));
        System.out.println("가로 4 세로 7인 직사각형의 넓이 = " + result(4,7));
        System.out.println("밑변 6 높이 3의 심각형의 넓이 = " + result(6.0,3.0));

        scanner.close();
    }

    public static double result(double a, int b){
        return a * (b * b);
    }
    public static double result(int a, int b){
        return a * b;
    }
    public static double result(double a, double b){
        return (a * b)/2;
    }
}
