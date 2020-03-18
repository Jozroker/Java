package mainPackage.core18.lesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Map<K, V> {

    private ArrayList<MyEntry<K, V>> map;

    public Map() {
        this.map = new ArrayList<>();
    }

    public void add(K key, V value) {
        int count = 0;
        for (MyEntry<K, V> elem : map) {
            if (elem.getKey().equals(key)) {
                elem.setValue(value);
                count++;
            }
        }
        if (count == 0) {
            map.add(new MyEntry<>(key, value));
        }
    }

    public void removeFromKey(K key) {
        int position = -1;
        for (MyEntry<K, V> elem : map) {
            if (elem.getKey().equals(key)) {
                position = map.indexOf(elem);
            }
        }
        if (position < 0) {
            System.out.println("This element isn't exist in map");
        } else {
            map.remove(position);
        }
    }

    public void removeFromValue(V value) {
        int position = -1;
        for (MyEntry<K, V> elem : map) {
            if (elem.getValue().equals(value)) {
                position = map.indexOf(elem);
            }
        }
        if (position < 0) {
            System.out.println("This element isn't exist in map");
        } else {
            map.remove(position);
        }
    }

    public void getKeys() {
        Set<K> keys = new HashSet<>();
        for (MyEntry<K, V> elem : map) {
            keys.add(elem.getKey());
        }
        System.out.println(keys);
    }

    public void getValues() {
        List<V> values = new ArrayList<>();
        for (MyEntry<K, V> elem : map) {
            values.add(elem.getValue());
        }
        System.out.println(values);
    }

    @Override
    public String toString() {
        return "Map{\n" +
                "map=" + map +
                '}';
    }
}
