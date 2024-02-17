package _05_Class._06_abstract;

public class StudentEx {
    public static void main(String[] args) {
        Kim kim = new Kim("김씨", "김가네 고등학교",18,201716018);
        Baek baek = new Baek("백씨", "배불뚝 고등학교", 19, 202216719);
        System.out.println(kim.getName());
        System.out.println(kim.getSchool());
        System.out.println(kim.getAge());
        System.out.println(kim.getNumber());

        kim.todo();

        System.out.println("=============================");

        System.out.println(baek.getName());
        System.out.println(baek.getSchool());
        System.out.println(baek.getAge());
        System.out.println(baek.getNumber());

        baek.todo();

    }
}
