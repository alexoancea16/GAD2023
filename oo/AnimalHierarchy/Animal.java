package oo.AnimalHierarchy;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }
}
