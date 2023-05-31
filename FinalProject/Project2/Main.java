package FinalProject.Project2;

public class Main {
    public static void main(String[] args) {
        Product phone = ProductFactory.createProduct("Phone");
        Product laptop = ProductFactory.createProduct("Laptop");
        Product tv = ProductFactory.createProduct("TV");

        phone.display();
        laptop.display();
        tv.display();
    }
}
