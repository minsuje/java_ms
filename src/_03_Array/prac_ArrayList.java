package _03_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class prac_ArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String > words = new ArrayList<>();
        while (true){
            System.out.println("문자를 입력해 주세요. : ");
            String typing = scanner.next();

            if (typing.equals("exit")){
                break;
            }
            words.add(typing);
        }

        for(String word: words){
            System.out.println(word);
        }
    }
}
