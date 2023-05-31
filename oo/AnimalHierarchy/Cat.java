package oo.AnimalHierarchy;

class Cat extends Animal implements Pet {
    private String name;

    Cat(String name) {
        super(4); // All cats have four legs
        this.name = name;
    }

    Cat() {
        this("");
    }

    @Override
    void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing.");
    }
}
