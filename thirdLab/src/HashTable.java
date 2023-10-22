public class HashTable<K, V> {
    private final int SIZE = 3;
    private Item<K, V>[] table;

    public HashTable(){
        table = new Item[SIZE];
    }

    public void put(K key, V value){
        int hash = key.hashCode() % SIZE;
        if (hash < 0) {
            hash = hash * -1;
        }
        Item<K, V> i = table[hash];
        if (i == null) {
            table[hash] = new Item<K, V>(key, value);
            return;
        }
        if (i.getKey() == key){
            i.setValue(value);
            return;
        }
        Item<K,V> next = i.getNext();
        if (next == null) {
            i.setNext(new Item<K, V>(key, value));
        }
        while(next != null){
            if (next.getKey() == key){
                next.setValue(value);
                return;
            }
            if (next.getNext() == null){
                next.setNext(new Item<K, V>(key, value));
                return;
            }
            next = next.getNext();
        }
    }

    public V get(K key){
        int hash = key.hashCode() % SIZE;
        if (hash < 0) {
            hash = hash * -1;
        }
        Item<K, V> i = table[hash];
        if (i == null){
            return null;
        }
        if (i.getKey() == key){
            return i.getValue();
        }
        Item<K, V> next = i.getNext();
        while (next != null){
            if (next.getKey() == key){
                return next.getValue();
            }
            next = next.getNext();
        }
        return null;
    }

    public Item<K, V> remove(K key){
        int hash = key.hashCode() % SIZE;
        if (hash < 0) {
            hash = hash * -1;
        }
        Item<K, V> i = table[hash];
        if (i == null){
            return null;
        }
        if (i.getKey() == key){
            table[hash] = i.getNext();
            i.setNext(null);
            return i;
        }
        Item<K, V> prev = i;
        Item<K, V> next = i.getNext();
        while (next != null){
            if (next.getKey() == key){
                prev.setNext(next.getNext());
                next.setNext(null);
                return next;
            }
            prev = next;
            next = next.getNext();
        }
        return null;
    }

    public int size(){
        int size = 0;
        for (int index = 0; index < SIZE; index++){
            if (table[index] != null){
                size ++;
                Item<K, V> next = table[index].getNext();
                while (next != null){
                    size ++;
                    next = next.getNext();
                }
            }
        }
        return size;
    }
    public boolean isEmpty(){
        for (int index = 0; index < SIZE; index++){
            if (table[index] != null){
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        String s = "";
        for (int index = 0; index < SIZE; index++){
            if (table[index] != null){
                s += "Index in table = " + index + "\n";
                s += "key = " + table[index].getKey().toString() + ", value = " + table[index].getValue().toString() + "\n";
                Item<K, V> next = table[index].getNext();
                while (next != null){
                    s += "key = " + next.getKey().toString() + ", value = " + next.getValue().toString() + "\n";
                    next = next.getNext();
                }
            }
        }
        return s;
    }
}