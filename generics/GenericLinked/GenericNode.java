package generics.GenericLinked;


class GenericNode<T> implements IGenericNode<T> {
    private T value;
    private IGenericNode<T> next;

    public GenericNode(T value) {
        this.value = value;
    }

    @Override
    public void insert(T element) {
        if (next == null) {
            next = new GenericNode<>(element);
        } else {
            next.insert(element);
        }
    }

    @Override
    public void println() {
        System.out.println(value);
        if (next != null) {
            next.println();
        }
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}
