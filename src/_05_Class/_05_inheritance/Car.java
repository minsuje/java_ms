package _05_Class._05_inheritance;

public class Car {
    private String brand;
    private String type;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void bus(String brand, String type, int year){
        System.out.println("브랜드 : " + brand + " , " + "기종 : " + type + " , " + "연도 : " + year);
        System.out.println("버스가 달립니다");
        System.out.println("빵 빵!");
    }
    public void bike(String brand, String type, int year){
        System.out.println("브랜드 : " + brand + " , " + "기종 : " + type + " , " + "연도 : " + year);
        System.out.println("오토바이가 달립니다");
        System.out.println("빠라바라바라밤!");
    }

}
