package generics.Pair;

public class Pair {
    private Shoe first;
    private final Shoe second;
    public Pair(Shoe firstElement, Shoe secondElement) {
        if (firstElement.getClass() != secondElement.getClass()) {
            throw new IllegalArgumentException("Both elements of the pair must be of the same type");
        }
        first = firstElement;
        second = secondElement;
    }
    public Shoe getFirst() {
        return first;
    }
    public Shoe getSecond() {
        return second;
    }
}
