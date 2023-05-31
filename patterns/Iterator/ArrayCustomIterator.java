package patterns.Iterator;

import java.util.NoSuchElementException;

public class ArrayCustomIterator {
    private int[] array;
    private int position;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < array.length;
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the array.");
        }
        return array[position++];
    }
}
