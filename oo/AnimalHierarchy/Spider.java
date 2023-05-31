package oo.AnimalHierarchy;

class Spider extends Animal {
    Spider() {
        super(8); // All spiders have eight legs
    }

    @Override
    void eat() {
        System.out.println("The spider is eating.");
    }
}