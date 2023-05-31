package collection.MyHashTable;

public class MapObj implements MyHashTable{
    private String key;
    private String value;

    public MapObj(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MapObj{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {

    }

    @Override
    public boolean containtsKey(Object key) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
