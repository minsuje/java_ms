package _05_Class._07_interface._01_Prac;

public class MusicEx{
    public static void main(String[] args) {
        Mp3Player mp3 = new Mp3Player("아이유 블루밍");
        CdPlayer cd = new CdPlayer("아이유 꽃갈피");

        System.out.println("===== MP3 =====");
        mp3.play();
        mp3.stop();

        System.out.println("===== CD Player =====");

        cd.play();
        cd.stop();
    }
}
