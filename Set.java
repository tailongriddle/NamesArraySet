import java.util.Iterator;

public interface Set<E> extends Iterable<E> {
    
    // @param e is the element to add (if not already present)
    // @return true if this set did not already contain the specified element
    boolean add(E e);
    
    // removes e from S (if it is present); r
    // @return true if element is found in set
    // @param e is the element to be removed
    boolean remove(E e); 
    
    // @return true if element is found in set
    // @ param e is the element to look for 
    boolean contains(E e); 
    
    // add all elements of T into this set S (result is S union T)
    // @param T is the set to union with this set
    void addAll(Set<E> T);
    
    // keep only elements in this set S that are also in T
    //(result is S intersect T)
    // @param T is the set to intersect with this set
    void retainAll(Set<E> T);
    
    // remove all elements from this set S that are in T (result is S-T)
    // @ param t is the set to set-subtract from this S
    void removeAll(Set<E> T);
}
