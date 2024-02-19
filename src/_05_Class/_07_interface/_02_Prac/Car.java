package _05_Class._07_interface._02_Prac;

public class Car extends Vehicle{


    // move 메서드 오버라이드
    @Override
    public void move() {
        System.out.println("도로를 따라 이동 중이다.");
    }

    public Car(String name, int age){
        setName(name);
        setMaxSpeed(age);
    }
}
