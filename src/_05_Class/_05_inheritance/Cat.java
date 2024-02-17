package _05_Class._05_inheritance;

public class Cat extends Animal {
    public Cat(String name, String species, int age){
        setAge(age);
        setName(name);
        setSpecies(species);
    }

    @Override
    public void makeSound(String sound){
        System.out.println(sound);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("코양이", "삼색", 20);

        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getSpecies());

        cat.makeSound("MEWWWWWWWWWWWWWWWWWWWWW");
    }


}
