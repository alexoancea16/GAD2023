package generics.Pair;

public class Running implements Shoe {
    private String brand;
    private int size;

    public Running(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
    public String getBrand() {
        return brand;
    }
    public int getSize() {
        return size;
    }
}
