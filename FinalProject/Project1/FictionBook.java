package FinalProject.Project1;

public class FictionBook implements Book {
    @Override
    public String getDescription() {
        return "Fiction Book";
    }

    @Override
    public double getPrice() {
        return 20.0;
    }
}
