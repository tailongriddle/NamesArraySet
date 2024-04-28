import java.util.Iterator;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;



/***
 * 
 * Implements a set using an ArrayList
 * 
 * @author tai
 *
 * @param <E>
 */
public class ArraySet<E> implements Set<E> {

  ArrayList<E> theSet; // declare an ArrayList to store elements of type E

  public ArraySet() {
    theSet = new ArrayList<E>(); // initialize the ArrayList
  }


  public void initialize(String filename) {
    // read file and load words into the ArrayList
    File f = new File(filename); // create a File object with the specified filename
    Scanner theScanner = null; // declare a Scanner object
    int count = 0; // initialize a counter variable

    try {
      theScanner = new Scanner(f); // initialize the Scanner with the File object
      while (theScanner.hasNextLine()) { // loop until there are no more lines in the file

        E name = (E) theScanner.next(); // read the next element from the Scanner
        theScanner.nextLine(); // consume the rest of the current line
        System.out.println(name); // print the element to console


        theSet.add(name); // add the element to the ArrayList

        count++; // increment the counter

      }
      System.out.println(count); // print the total count of elements read from the file



    } catch (IOException ex) { // handle input-output exceptions
      ex.printStackTrace(); // print the stack trace of the exception
    }
    theScanner.close(); // close the Scanner object
  }

  @Override
  public Iterator<E> iterator() {
    return theSet.iterator(); // return an iterator over the elements in the ArrayList
  }

  @Override
  public boolean add(E e) {
    if (theSet.contains(e)) { // check if the element is already present in the ArrayList
      return false; // if yes, return false
    } else {
      theSet.add(e); // if not, add the element to the ArrayList
      return true; // return true
    }
  }

  @Override
  public boolean remove(E e) {
    return theSet.remove(e); // remove the specified element from the ArrayList
  }

  @Override
  public boolean contains(E e) {
    return theSet.contains(e); // check if the ArrayList contains the specified element
  }

  @Override
  public void addAll(Set<E> T) {
    for (E e : T) { // loop through each element in the given Set
      add(e); // add the element to this ArraySet
    }
  }

  @Override
  public void retainAll(Set<E> T) {

    Iterator<E> itr = theSet.iterator(); // get an iterator over the elements in the ArrayList

    while (itr.hasNext()) { // loop until there are no more elements
      if (!T.contains((E) itr.next())) { // if the specified Set doesn't contain the next element
        itr.remove(); // remove the current element from the ArrayList
      }
    }


  }

  public String toString() {
    String e = " "; // initialize an empty string

    for (E j : theSet) { // loop through each element in the ArrayList
      e = e + " " + j.toString(); // append the string representation of the element to the string

    }

    return e; // return the concatenated string


  }

  public int size() {
    int theSize = 0; // initialize a variable to store the size of the ArrayList

    for (E j : theSet) { // loop through each element in the ArrayList
      theSize++; // increment the size counter

    }

    return theSize; // return the size of the ArrayList


  }

  @Override
  public void removeAll(Set<E> T) {
    for (E e : theSet) { // loop through each element in the ArrayList
      if (T.contains(e)) { // if the specified Set contains the current element
        remove(e); // remove the element from the ArrayList
      }
    }


  }
}
