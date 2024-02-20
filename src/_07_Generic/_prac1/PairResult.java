package _07_Generic._prac1;

public class PairResult {
    public static void main(String[] args) {
        Pair<String, Integer> value1 = new Pair<>("One", 1);
        System.out.println("Key : " + value1.getKey() + " , " + "Value : " +  value1.getValue());

        Pair<Integer, String> value2 = new Pair<>(2, "Two");
        System.out.println("Key : " + value2.getKey() + " , " + "Value : " +  value2.getValue());


    }
}
