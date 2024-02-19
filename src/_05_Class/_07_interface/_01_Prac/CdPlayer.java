package _05_Class._07_interface._01_Prac;

public class CdPlayer implements Music {

    private String album;
    public CdPlayer(String album){
        this.album = album;
    }
    @Override
    public void play() {
        System.out.println("CD 플레이어에서 " + album + "을 재생합니다. ");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 " + album + "을 정지합니다. ");
    }
}
