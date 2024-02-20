package _07_Generic._prac2;

public class Calculator<T extends Number> {
    // 더하기 메서드에서 double 을 반환시키기 위해 Number로 제한
    private T number1;
    private T number2;

    public Calculator(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add(){
        return number1.doubleValue() + number2.doubleValue();
    }
}
