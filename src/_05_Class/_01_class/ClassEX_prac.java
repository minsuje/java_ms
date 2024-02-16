package _05_Class._01_class;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ClassEX_prac {
    // 필드
    private int width;
    private int height;

    static int count;
    private ClassEX_prac() {
//        this.width = width;
        count++;
    }

    private int getWidth(){
        return width;
    }
    private void setWidth(int width){
        this.width = width;
    }
    private int getHeight(){
        return height;
    }
    private void setHeight(int height){
        this.height = height;
    }
    private int area(){
        return  width * height;
    }

    public static void main(String[] args) {

        ArrayList<ClassEX_prac> rect = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            ClassEX_prac w = new ClassEX_prac();
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해 주세요.");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            if(width == 0 && height == 0){
                break;
            }

            w.setWidth(width);
            w.setHeight(height);

            rect.add(w);
        }
        for (ClassEX_prac r : rect) {
            System.out.println("가로의 길이는 : " + r.getWidth());
            System.out.println("세로의 길이는 : " + r.getHeight());
            System.out.println("넓이는 : " + (r.area()));
            System.out.println("=============================");
        }
        System.out.println("카운트 : " + count);

        scanner.close();
    }
}
