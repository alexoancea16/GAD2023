package generics.GenericIterator;

class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        T element = array[currentIndex];
        currentIndex++;
        return element;
    }
}
