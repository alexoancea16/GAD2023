package oo.AnimalHierarchy;

class Fish extends Animal {
    Fish() {
        super(0); // All fish have zero legs
    }

    @Override
    void eat() {
        System.out.println("The fish is eating.");
    }

    @Override
    void walk() {
        System.out.println("Fish can't walk.");
    }
}