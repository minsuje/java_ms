package _05_Class._05_inheritance;

public class AnimalEx {
    public static void main(String[] args) {

        Dog dog = new Dog("강아지","코기",20);

        System.out.println(dog.getAge());
        System.out.println(dog.getName());
        System.out.println(dog.getSpecies());

        dog.makeSound("DOGGGGGGGGGGGGGGGGGGG");

        Cat cat = new Cat("코양이", "삼색", 20);

        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getSpecies());

        cat.makeSound("MEWWWWWWWWWWWWWWWWWWWWW");
    }
}
