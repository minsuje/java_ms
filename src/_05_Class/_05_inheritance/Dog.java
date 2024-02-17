package _05_Class._05_inheritance;

public class Dog extends Animal {
    public Dog(String species, String name, int age){
        setAge(age);
        setName(name);
        setSpecies(species);
    }

    public void makeSound(String sound){
        System.out.println(sound);
    }
}
