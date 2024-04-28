import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.AbstractMap.SimpleEntry;

/***
 * 
 * ArrayMap class that stores keys 
 * 
 * @author tai
 *
 * @param <K>
 * @param <V>
 */
public class ArrayMap<K,V> implements Map<K,V> {

  private ArrayList<Entry<K,V>> myList; // declare an ArrayList to store key-value pairs
  
  public ArrayMap() {
      myList = new ArrayList<Entry<K,V>>(); // initialize the ArrayList
  }
  
  @Override
  public int size() {
      return myList.size(); // return the size of the ArrayList
  }

  @Override
  public boolean isEmpty() {
      return myList.isEmpty(); // check if the ArrayList is empty
  }

  @Override
  public V get(K key) {
      for ( Entry<K,V> ent : myList ) { // iterate over each entry in the ArrayList
          if (ent.getKey().equals(key)) { // if the key of the current entry matches the specified key
              return ent.getValue(); // return the value associated with the key
          }
      }
      return null; // if no matching key is found, return null
  }

  @Override
  public V put(K key, V value) {
      for ( Entry<K,V> ent : myList ) { // iterate over each entry in the ArrayList
          if (ent.getKey().equals(key)) { // if the key of the current entry matches the specified key
              return ent.setValue(value); // set the new value and return the old value
          }
      }
      myList.add( new SimpleEntry<K,V>(key,value)); // if no matching key is found, add a new entry to the ArrayList
      return value; // return the new value
  }

  @Override
  public V remove(K key) {
      for ( Entry<K,V> ent : myList ) { // iterate over each entry in the ArrayList
          if (ent.getKey().equals(key)) { // if the key of the current entry matches the specified key
              myList.remove(ent); // remove the entry from the ArrayList
              return ent.getValue(); // return the value associated with the removed key
          }
      }
      return null; // if no matching key is found, return null
  }

  @Override
  public Iterable<K> keySet() {
      ArrayList<K> result = new ArrayList<K>(); // create a new ArrayList to store keys
      for ( Entry<K,V> ent : myList ) { // iterate over each entry in the ArrayList
          result.add( ent.getKey() ); // add the key of each entry to the result ArrayList
      }
      return result; // return the collection of keys
  }

  @Override
  public Iterable<V> values() {
      ArrayList<V> result = new ArrayList<V>(); // create a new ArrayList to store values
      for ( Entry<K,V> ent : myList ) { // iterate over each entry in the ArrayList
          result.add( ent.getValue() ); // add the value of each entry to the result ArrayList
      }
      return result; // return the collection of values
  }

  @Override
  public Iterable<Entry<K, V>> entrySet() {
      return myList; // return the ArrayList of key-value pairs as an iterable collection
  }

}