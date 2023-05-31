package collection.MyHashTable;

public interface MyHashTable <K,V>{
    V get(K key);
    void put(K key, V value);
    boolean containtsKey(K key);
    int size();
}
