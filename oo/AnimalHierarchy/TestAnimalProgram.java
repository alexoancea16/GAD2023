package oo.AnimalHierarchy;

public class TestAnimalProgram {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        c.eat();
        c.walk();
        c.play();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.setName("Tom");
        System.out.println("Pet name: " + p.getName());

        Animal[] animals = {d, c, a, e};
        for (Animal animal : animals) {
            animal.eat();
            animal.walk();
        }

        Cat cat = new Cat();
        cat.walk();
        cat.eat();
    }
}
