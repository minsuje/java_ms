package _04_exception;

import java.util.*;
import java.util.stream.Collectors;

public class Exception_Prac {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};

//        try{
//            for (int i = 0; i < 5 ; i++) {
//                System.out.println(arr[i]);
//            }
//        }catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스 범위를 벗어났습니다.");
//        }
//        try {
//            int[] num;
//            while (true) {
//                System.out.println("배열의 크기를 입력하세요");
//                Scanner scanner = new Scanner(System.in);
//                int index = scanner.nextInt();

//        if (index <= 0) {
//            throw new IllegalAccessException("배열의 크기는 1 이상이어야 한다.");
//        }
//                num = new int[index];
//
//                for (int i = 0; i < num.length; i++) {
//                    System.out.println("정수 : " + (i + 1));
//                    int number = scanner.nextInt();
//                    num[i] = number;
//                }
//                break;
//            }
//            int sum = 0;
//            // 평군 값
//            for (int n : num) {
//                sum += n;
//            }
//            System.out.println(" 평군 값 = " + (double) (sum / num.length));
//        }catch(InputMismatchException e) {
//            System.out.println("에러 발생 >> " + e.toString());
//        }
//        catch(ArithmeticException e) {
//            System.out.println("배열로 크기로 0값이 들옴 > " + e.toString());
//        } catch(IllegalAccessException e){
//        System.out.println(e.getMessage());
//    }finally{
//            scanner.close();
//        }


        try{
            System.out.println("배열의 크기를 입력하세요");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            ArrayList<Integer> numList = new ArrayList<>(index);

            while (true){
                System.out.println("배열에 요소를 입력해 주세요 : " );
                int numberIndex = scanner.nextInt();

                numList.add(numberIndex);

                if(numList.size() == index){
                    break;
                }
            }

            System.out.println("numList = " + numList);
            // 중복된 요소 찾기
            ArrayList<Integer> duplicates = findDuplicates(arr);

            // 중복된 요소 출력
            if(duplicates.isEmpty()){
                System.out.println("중복된 요소가 없습니다.");
            } else{
                System.out.println("중복된 요소 : " + duplicates);
            }


        }catch(InputMismatchException e) {
            System.out.println("에러");
        }

    }

    // 중복된 요소를 찾는 메소드
    public static ArrayList<Integer> findDuplicates(int[] arr){
        ArrayList<Integer> duplicates = new ArrayList<>();
        // ex. arr: [1,2,3,2,1]
        // index
        // 0에 대해서 1,2,3,4 ( 본인을 제외한 값들을 비교 ) => i = 0, j = 1 ~ length - 1
        // 1에 대해서 2,3,4 중복 확인
        // 2에 대해서 3,4 중복 확인
        // 3에 대해서 4 중복 확인

        for(int i =0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i] == arr[j] && !duplicates.contains(arr[i])){
                    // 중복된 요소가 한번만 추가되도록 !duplicates.contains 추가
                    duplicates.add(arr[i]);
                }
            }
        }
        System.out.println(duplicates);
        return duplicates;
    }
}
