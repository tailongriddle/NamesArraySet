
/***
 * 
 * Driver to test Arrays
 * 
 * @author tai
 *
 */
public class HomeworkDriver {
  
  /***
   * Main method for testing the ArraySet class.
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    
    
    ArraySet<String> femaleSet = new ArraySet<String>(); // create a new ArraySet to store female names
    femaleSet.initialize("femaleNames2016.txt"); // initialize the femaleSet with names from a file
    
    
    ArraySet<String> maleSet = new ArraySet<String>(); // create a new ArraySet to store male names
    maleSet.initialize("maleNames2016.txt"); // initialize the maleSet with names from a file
    
    
    ArraySet<String> bothSet = femaleSet; // create a new ArraySet and assign it the values of femaleSet
    
    // find the intersection of femaleSet and maleSet
    bothSet.retainAll(maleSet); 
    
    
    // print the elements of bothSet
    System.out.println(bothSet.toString());
    
    // print the size of bothSet
    System.out.println(bothSet.size());

    
    
  }
}