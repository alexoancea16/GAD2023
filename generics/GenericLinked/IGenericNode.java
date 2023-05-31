package generics.GenericLinked;

public interface IGenericNode <T> {
    void insert(T element);
    void println();
    T getValue();
    void setValue(T value);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}
