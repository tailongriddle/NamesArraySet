
import java.util.Iterator;
import java.util.Map.Entry;

/***
 * This interface defines a generic Map data structure
 * 
 * @param <K> the type of keys in the map
 * @param <V> the type of values in the map
 */
public interface Map<K,V> {

    // returns the number of key-value mappings in the map
    public int size();
    
    // checks if the map contains no key-value mappings
    public boolean isEmpty();
    
    // returns the value to which the specified key is mapped, or null if this map contains no mapping for the key
    public V get(K key);
    
    // associates the specified value with the specified key in the map
    // returns the previous value associated with the key, or null if there was no mapping for the key
    public V put(K key, V value);
    
    // removes the mapping for a key from this map if it is present
    // returns the previous value associated with the key, or null if there was no mapping for the key
    public V remove(K key);
    
    // returns an iterable collection of all keys in the map
    public Iterable<K> keySet();
    
    // returns an iterable collection of all values in the map
    public Iterable<V> values();
    
    // returns an iterable collection of all key-value mappings in the map
    public Iterable<Entry<K,V>> entrySet();
}
