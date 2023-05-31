package collection.MyHashTable;
import java.util.ArrayList;

public class Map implements MyHashTable{
    private ArrayList<MapObj> mapa;
    public Map(){
        mapa =  new ArrayList<MapObj>();
    }
    @Override
    public Object get(Object key) {
        for(int i =0; i<mapa.size(); i++) {
            if (mapa.get(i).getKey().equals(key))
                return mapa.get(i).getValue();
        }
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        MapObj add = new MapObj((String) key, (String) value);
        mapa.add(add);
    }

    @Override
    public boolean containtsKey(Object key) {
        for(int i =0; i<mapa.size(); i++) {
            if (mapa.get(i).getKey().equals(key))
                return true;
        }
        return false;

    }

    @Override
    public int size() {
        return mapa.size();
    }

    public void print(){
        for(int i=0; i<mapa.size(); i++) {
            System.out.println(mapa.get(i).toString());
        }
    }
}
