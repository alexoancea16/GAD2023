package FinalProject.Project1;

public class Main {
    public static void main(String[] args) {
        // Crearea unui obiect FictionBook
        Book fictionBook = new FictionBook();

        // Adăugarea opțiuni suplimentare folosind Decorator Pattern
        Book giftWrappedBook = new GiftWrappingDecorator(fictionBook);
        Book expressDeliveryBook = new ExpressDeliveryDecorator(giftWrappedBook);

        // Afișarea descrierii și prețului final al cărții
        System.out.println("Description: " + expressDeliveryBook.getDescription());
        System.out.println("Price: $" + expressDeliveryBook.getPrice());
    }
}
