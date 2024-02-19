package _05_Class._07_interface._01_Prac;

public class Mp3Player implements Music{
    private String song;
    public Mp3Player(String song){
        this.song = song;
    }
    @Override
    public void play() {
        System.out.println("CD 플레이어에서 " + song + "을 재생합니다. ");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 " + song + "을 정지합니다. ");
    }
}
