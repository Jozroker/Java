package mainPackage.core18.lesson;

public class MyEntry<K, V> {

    private K key;
    private V value;

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nMyEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
