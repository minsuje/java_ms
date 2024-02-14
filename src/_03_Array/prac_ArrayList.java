package _03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class prac_ArrayList {
    public static void main(String[] args) {

        System.out.println("문자를 입력해 주세요. : ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String > words = new ArrayList<>();

        String typing = scanner.next();

        if(words.equals("exit")){
            for (String word : words) {
                System.out.println(word);
            }
        }else{
            System.out.println("문자를 입력해 주세요. : ");
            words.get(typing);
        }

    }
}
