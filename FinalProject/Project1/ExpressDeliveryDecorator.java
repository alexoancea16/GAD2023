package FinalProject.Project1;

public class ExpressDeliveryDecorator extends BookDecorator {
    public ExpressDeliveryDecorator(Book book) {
        super(book);
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", Express Delivery";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + 10.0;
    }
}
