package FinalProject.Project2;

public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("Phone")) {
            return new Phone();
        } else if (type.equalsIgnoreCase("Laptop")) {
            return new Laptop();
        } else if (type.equalsIgnoreCase("TV")) {
            return new TV();
        } else {
            return null;
        }
    }
}
