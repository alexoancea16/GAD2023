package collection.MySet;

import java.util.Arrays;

public class MySet<T> implements IMySet<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MySet() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public void add(T e) {
        if (!contains(e)) {
            ensureCapacity(size + 1);
            elements[size++] = e;
        }
    }

    @Override
    public void remove(T e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                int numMoved = size - i - 1;
                if (numMoved > 0) {
                    System.arraycopy(elements, i + 1, elements, i, numMoved);
                }
                elements[--size] = null;
                break;
            }
        }
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        }
        throw new IndexOutOfBoundsException("Index out of range");
    }

    @Override
    public void set(int index, T e) {
        if (index >= 0 && index < size) {
            elements[index] = e;
        } else {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
}
