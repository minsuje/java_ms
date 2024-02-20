package _08_collection._Prac1;

import java.util.*;

public class CollectEx {
    public static void main(String[] args) {
        System.out.println("정수를 입력해 주세요 -1을 입력하면 종료됩니다.");

        Set<Integer> set = new HashSet<>();
        while (true){
            System.out.printf("정수 입력 : ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            if(num == -1){
                scanner.close();
                break;

            }
            set.add(num);
        }
        System.out.println("중복 제거된 정수 목록 : " + set);

    }
}
