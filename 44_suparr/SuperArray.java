/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW44 -- add, add-at-index, remove for SuperArray
2021-12-07
time spent:  0.5 hours

DISCO
- For curtis, we had to use an if statement to change _size so that the populated ints in the array showed.

QCC
- Is there a more efficient way to slice strings? 
- Is there a more efficient way to add to strings?
 *****************************************************/

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _size; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ )
      temp[i] = _data[i];
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    
    if (index + 1 > _size) { // If we want to assign an index that is greater than the current _size, change the _size accordingly
      _size = index +1; 
    }
    return temp;
  }


  //adds an item after the last item
  public void add( int newVal )
  {
    if (_size == _data.length - 1){ 
      expand(); // expand if we are close to needing more indexes
    }
    set(_size, newVal);
  }


  //inserts an item at index
  public void add( int index, int newVal )
  {
    int[] tempData = new int[_size + 1];
    for (int x = 0 ; x < index ; x++) {
      tempData[x] = _data[x];
    }
    tempData[index] = newVal;
    
    for (int x = index + 1 ; x < _size + 1; x++) {
      tempData[x] = _data[x - 1];
    }
    _size += 1;
    _data = tempData;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index )
  {
    int[] tempData = new int[_size - 1];
    
    for (int x = 0 ; x < index ; x++) {
      tempData[x] = _data[x];
    }
    
    for (int x = index ; x < _size - 1; x++) {
      tempData[x] = _data[x + 1];
    }
    _size -= 1;
    _data = tempData;
  }


  //return number of meaningful items in _data
  public int size()
  {
    return _size; 
  }



  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      System.out.println("new length of underlying array: "
      + curtis._data.length );
      }
      SuperArray mayfield = new SuperArray();
      System.out.println("Printing empty SuperArray mayfield...");
      System.out.println(mayfield);
      mayfield.add(5);
      mayfield.add(4);
      mayfield.add(3);
      mayfield.add(2);
      mayfield.add(1);
      System.out.println("Printing populated SuperArray mayfield...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.remove(3);
      System.out.println("Printing SuperArray mayfield post-remove...");
      System.out.println(mayfield);
      mayfield.add(3,99);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(2,88);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
      mayfield.add(1,77);
      System.out.println("Printing SuperArray mayfield post-insert...");
      System.out.println(mayfield);
        /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
