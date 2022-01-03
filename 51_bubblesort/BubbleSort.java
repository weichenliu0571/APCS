/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW51 -- Working on BubbleSorting
2021-01-03
time spent:  0.5 hours

 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * In each pass of the arraylist, we use an if statement inside a for loop to compare consecutive elements on the arraylist. 
 * If index x is less than the index x - 1, they swap places.
 * We keep passing through the arraylist until we reach the amount of passes that occured. 
 *
 * DISCO
 * The input is a class ArrayList, so we have to use the get() to access the elements of the arraylist. 
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: The previous element is less than or equal to the following element.
 * q1: After pass p, what do you know?
 * a1: The first p elements are sorted.
 * q2: How many passes are necessary to completely sort?
 * a2: The number of passes necessary is equal to one less than the number of elements in an array.
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for ( int i = 0 ; i < data.size() - 1 ; i++) {
      // Amount of times we pass through the entire arraylist
      for ( int x = data.size() - 1 ; x > i ; x--) {
        // Allows us to compare consecutive values of elements on the array list
        if ((data.get(x).compareTo(data.get(x-1)) < 0)) { 
          Comparable n = data.get(x-1);
          data.set(x, data.get(x-1));
          data.set(x-1, n);
        }
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    ArrayList copy = new ArrayList<Comparable>(); 
    
    for (Comparable i : input) {
      copy.add(i); 
    }
    bubbleSortV(copy);
    return copy; 
  }


  public static void main( String [] args )
  {
      /*===============for VOID methods=============
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glenSorted );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
        /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
