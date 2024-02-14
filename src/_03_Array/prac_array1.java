package _03_Array;

import java.util.Scanner;

public class prac_array1 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();



        int[] arr = {num1, num2, num3, num4, num5};
        int result = 0;
        for (int i = 0; i <arr.length ; i++) {
            result += arr[i];
        }
        System.out.println("평균은 " + ((double)result/5));

        scanner.close();
    }
}
