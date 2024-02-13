package _01_basic_syntax;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;

        // 대입 연산자 (=)
        x = 10;
        y = 20;
        a = 5.0f;
        b = 10.0f;

        // 산술 연산자: 숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("====== x , y =====");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("y / x = " + (y / x));
        System.out.println("x % y = " + (x % y));

        System.out.println("====== a , b =====");
        System.out.printf("a = %f", a);
        System.out.printf("b = %f", b);
        System.out.printf("a + b = %f", (a + b));
        System.out.printf("a - b = %f" , (a - b));
        System.out.printf("a * b = %f" , (a * b));
        System.out.printf("b / a = %f" , (b / a));
        System.out.println("a % b = " + (a % b));

        // 증가 , 감소 연산자
        System.out.println("====== 증감 연산자 ======");
        System.out.println("x++ = " + x++ + " " + x);
        System.out.println("++x = " + ++x);
        System.out.println("x-- = " + x-- + " " + x);
        System.out.println("--x = " + --x);

        // 산술적인 대입 연산자
        System.out.println("=== 산술적인 대입 연산자 ===");
        System.out.println(x);
        System.out.println("x += 5 >>> " + (x += 5));
        System.out.println(x);

        // 비교 연산자 : 연산 결과 불리언 (true / false)
        System.out.println("===== 비교 연산자 =====");
        System.out.println("a > b >>" + (a > b));
        System.out.println("a >= b >>" + (a >= b));
        System.out.println("a < b >>" + (a < b));
        System.out.println("a <= b >>" + (a <= b));
        System.out.println("a == b >>" + (a == b));
        System.out.println("a != b >>" + (a != b));

        // 논리 연산자
        boolean j = true;
        boolean k = false;
        boolean l = true;

        System.out.println("===== 논리 연산자 =====");
        System.out.println(" j && k >> " + (j && k)); // AND : j 와 k 모두 참이어야 참
        System.out.println("j && l >> " + (j && l));
        System.out.println("j || k >> " + (j || k)); // OR : j, k  둘 중 하나라도 참이면 참
        System.out.println("j || l >> " + (j || l));
        System.out.println("!j >> " + (!j)); // NOT: 부정

        // 삼항 연산자
        System.out.println("===== 삼항 연산자 =====");
        System.out.println(x > y ? "x는 y보다 큼!" : "x는 y보다 작음!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력하세요");
        String name = scanner.next();
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();
//        System.out.println("안녕하세요 " + name + "님 " +"(" + age + "세)");w
        System.out.printf("안녕하세요 %s님, (%d세)", name,age);

        scanner.close();
    }
}
