package _02_control_statement;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요 >>");
        Scanner scanner = new Scanner(System.in);

//        String name = scanner.next();
        int number = scanner.nextInt();
//        String age;
//        age = switch (number) {
//            case 1, 2, 3, 4, 5, 6, 7 -> "유아";
//            case 8, 9, 10, 11, 12, 13 -> "초등학생";
//            case 14, 15, 16 -> "중학생";
//            case 17, 18, 19 -> "고등학생";
//            default -> "성인";
//        };
//
//        System.out.println(age);

        if( number >= 1 && number <= 7 ){
            System.out.println("유아");
        }else if(number >= 8 && number <= 13){
            System.out.println("초등학생");
        } else if (number >= 14 && number <= 16) {
            System.out.println("중학생");
        } else if (number >= 17 && number <= 19){
            System.out.println("고등학생");
        } else if(number >= 20){
            System.out.println("성인");
        }

//        if(name.equals("홍길동")){
//            System.out.println("남자");
//        }else if(name.equals("성춘향")){
//            System.out.println("여자");
//        }else {
//            System.out.println("모르겠어요");
//        }

    }
}
