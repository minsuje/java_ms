package _05_Class._04_final;

// 상수
// - 상수는 변하지 않는 값
// - 객체마다 저장할 필요가 없고, 단 한번만 값이 선언되기 때문에
// - static 이면서 final 인 특성을 갖는다
// - 대문자로 작성하는 것이 관례
public class ConstEx {
    public static void main(String[] args) {
        // 상수 읽기
        System.out.println(Const.MAX_VALUE);
        System.out.println(Const.GREETING);

        // 값 변경 X
        // Const.GREETING = "Bye, world"; // 에러
        // Const.MAX_VALUE = 200; // 에러
    }
}
