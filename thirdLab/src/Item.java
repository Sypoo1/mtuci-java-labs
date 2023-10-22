public class Item<K, V>{
    private K key;
    private V value;
    private Item<K, V> next;
    public Item(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public Item<K, V> getNext() {
        return next;
    }
    public void setNext(Item<K, V> next) {
        this.next = next;
    }
    public void setValue(V value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return "key = " + key.toString() + ", value = " + value.toString();
    }
}