package FinalProject.Project1;

public class GiftWrappingDecorator extends BookDecorator {
    public GiftWrappingDecorator(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Gift Wrapping";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 5.0;
    }
}
