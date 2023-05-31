package generics.Box;

public class GenericsBox<T> {
    private T object;

    public void set(T obj) {
        this.object = obj;
    }

    public T get() {
        return object;
    }
}
