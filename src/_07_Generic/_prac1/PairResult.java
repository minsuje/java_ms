package _07_Generic._prac1;

public class PairResult {
    public static void main(String[] args) {
        Pair<String> value1 = new Pair<>("One", "1");
        System.out.println("Key : " + value1.getKey() + " , " + "Value : " +  value1.getValue());
    }
}
