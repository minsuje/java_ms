package _07_Generic._prac1;

public class Pair<T> {
    private T key;
    private T value;

    public Pair(T key, T value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
