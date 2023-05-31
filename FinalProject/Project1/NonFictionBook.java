package FinalProject.Project1;

public class NonFictionBook implements Book {
    @Override
    public String getDescription() {
        return "Non-Fiction Book";
    }

    @Override
    public double getPrice() {
        return 15.0;
    }
}
