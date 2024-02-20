package _07_Generic._prac2;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator<Integer> calculator1 = new Calculator<>(10,40);
        Calculator<Double> calculator2 = new Calculator<>(5.8,1.9);

        System.out.println("Integer Sum : " + calculator1.add());
        System.out.println("Double Sum : " + calculator2.add());

    }
}
