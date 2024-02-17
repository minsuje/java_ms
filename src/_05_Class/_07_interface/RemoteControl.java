package _05_Class._07_interface;

// interFace 선언

public interface RemoteControl {
    // 추상 메서드 선언
    public abstract void turnOn();
    public void turnOff(); // abstract 이 없어도 자동으로 추상 메서드로 인식

    public void setVolume(int volume);

    // 상수 필드
    // - 인터페이스에 선언된 필드는 모두 "public static final" 특성을 갖는다.
    // 생략하더라도 컴파일 과정에서 자동으로 붙음
    // - 상수명은 대문자로 작성, 언더바로 연결

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 1;



}
