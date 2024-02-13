package _02_control_statement;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        int number = 10;

        if (number %2 == 0){
            System.out.println("짝수 입니다.");
        }else{
            System.out.println("홀수 입니다.");
        }

        // 문자열(String) 객체 비교
        System.out.println("이름을 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("name 값 확인 : " + name);

//        if (name == "마이짐"){
//            System.out.println("회원 등록");
//        } else {
//            System.out.println("내용을 다시 입력하세요");
//        }
        if (name.equals("마이짐")){
            System.out.println("회원 등록");
        } else {
            System.out.println("내용을 다시 입력하세요");
        }

        // why???
        // - '==' 연산자 : 두 객체의 참조 비교 ( 동일한 메모리 위치 가르키는지 확인 )
        // - 'equals()' 메서드 : 두 겍체의 내용이 동일한지 비교

        // 문자열 리터럴의 경우 => Java 에서 특별 취급
        // 동일한 문자열 리터럴이 사용되는 경우, Java 컴파일러는 문자열 풀(String pool) 이라는 공유된 메모리 영역에 해당 문자열 저장
        // str1 , str2 같은 경우 같은 문자열을 가리키고 있으므로 같은 참조값을 가짐
        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("같은 참조를 가리킴");
        } else{
            System.out.println("같은 주소(참조)가 아님");
        }

        if (str1.equals(str2)) {
            System.out.println("같은 참조를 가리킴");
        } else{
            System.out.println("같은 주소(참조)가 아님");
        }

        // 문자열을 "동적 할당"하게 되는 경우, ex) new String(...) 을 이용해서 새로운 문자열 객체를 생성 -> 서로 다른 객체를 가리킴
        // str3 , str4 서로 다른 객체 => '==' 연산자로 비교 시 false
        // 따라서 문자열 비교시 (내용) 기본적으로 '.equals()' 메서드로 비교하는 것이 좋다.
        String str3 = new String("hi");
        String str4 = new String("hi");

        if (str3 == str4) {
            System.out.println("같은 참조를 가리킴");
        } else{
            System.out.println("같은 주소(참조)가 아님");
        }

        if (str3.equals(str4)) {
            System.out.println("같은 참조를 가리킴");
        } else{
            System.out.println("같은 주소(참조)가 아님");
        }


        // switch - case 문
        // - 각 case 문의 break 문으로 선태 사항, break 문 생략 시 바로 밑의 case 문으로 넘어감
        String dayOfWeek;
        int day = 4;

//        switch (day){
//            case 1:
//                dayOfWeek = "일요일";
//                break;
//            case 2:
//                dayOfWeek = "월요일";
//                break;
//            case 3:
//                dayOfWeek = "화요일";
//                break;
//            case 4:
//                dayOfWeek = "수요일";
//                break;
//            case 5:
//            case 6:
//            case 7:
//                dayOfWeek = "목 ~ 토";
//                break;
//            default:
//                dayOfWeek = "잘못된 출력 입니다.";
//                break;
//        }

        dayOfWeek = switch (day) {
            case 1 -> "일요일";
            case 2 -> "월요일";
            case 3 -> "화요일";
            case 4 -> "수요일";
            case 5, 6, 7 -> "목 ~ 토";
            default -> "잘못된 출력 입니다.";
        };

        System.out.println(dayOfWeek);

    }
}
