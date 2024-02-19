package _05_Class._07_interface._02_Prac;

import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        // Vehicle 배열 생성
//        Vehicle[] vehicles = new Vehicle[2];
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("자동차", 180);
//        vehicles[0] = car;

        AirPlane airPlane = new AirPlane("비행기", 500);
//        vehicles[1] = airPlane;

        vehicles.add(car);
        vehicles.add(airPlane);

        for(Vehicle V : vehicles){
            System.out.println(V.getName());
            System.out.println(V.getMaxSpeed());
            V.move();
            // false, true 중 값을 출력
            System.out.println(V instanceof Fly); // 자식 클래스가 상속을 받은 경우나, 서브 클래스 이면 어떤 부모를 가지고 있는지 확인
            // Fly 구현한 경우 fly() 메서드 호출
           if(V instanceof Fly){ // car, airplane
               ((Fly) V).fly(); // 명시적 형변환, Fly 말고 AirPlane 도 가능
            }
        }
//        airPlane.fly();
    }
}
