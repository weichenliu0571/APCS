// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW82 -- Roll Your Own Iterator
// 2022-03-28m
// time spent : 0.5 hrs

// DISCO:
// * Iterator functionality can override FOREACH loop -- reminds me of toString.
// * When we return the MyIterator() in the iterator(), we had to set aside memory.
// * When using next() and remove(), we had to throw NoSuchElementException and IllegalStateException.

// QCC:
// * Previously when we've used the FOREACH loop, have we always been using the
// functionality of Iterator?
// * What are other examples of Iterables besides Collections?
// * Can Iterator be implemented to traverse both directions of a linked list?
// * Why not use a try-catch block?
// * How does the driver (V6Driver) test remove()?

/***
 * class V6Driver
 * ...for testing implementation of Iterable interface
 *    (ability to run a FOREACH loop over your LList)
 *
 * Assumes local version of List.java, overriding Java standard library interface
 **/

public class V6Driver
{
  public static void main( String[] args )
  {
    List<String> wu = new LList<String>();

    System.out.println(wu);
    wu.add("RZA");
    wu.add("GZA");
    wu.add("ODB");
    wu.add("Inspectah Deck");
    wu.add("Raekwon the Chef");
    wu.add("U-God");
    wu.add("Ghostface");
    wu.add("Method Man");
    System.out.println(wu);

    for( String s : wu ) {
      System.out.println( s + " raps for the Wu");
    }
  }//end main()

}//end class
