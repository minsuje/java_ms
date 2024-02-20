package _08_collection._Prac1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MapPrac {
    public static void main(String[] args) {
        System.out.println("이름과 나이를 입력하세요, '종료'를 입력하면 종료됩니다.");

        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("이름을 입력하세요");
            String name = scanner.next();
            if(name.equals("종료")){
                break;
            }
            System.out.println("나이를 입력하세요");
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            map.put(name, age);
        }

        System.out.println("===== 입력받은 이름과 나이 =====");
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("이름 : " + entry.getKey() + ", 나이 : " + entry.getValue());
        }
        scanner.close();
//        Iterator<Map.Entry<String , Integer>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String , Integer> entry = iterator.next();
//            String n = entry.getKey();
//            Integer a = entry.getValue();
//            System.out.printf("이름 %s 나이 : %d %n%n", n,a);
//        }

    }
}
