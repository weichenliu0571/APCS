/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW43 -- Creating Wrapper Class for Arrays
2021-12-06
time spent:  0.5 hours

DISCO
- You can set _data to be another array.  
- It is always good to have an accessor method. 

QCC
- Will we have to deal with "left-justify" next?
- What happens to the original array when it is assigned to be another array? 
 *****************************************************/

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 10; 
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    	String ans = "[ ";
	    for( int i = 0; i < _size - 1; i++ )
	        ans += _data[i] + ",";
	    ans += _data[_size - 1];
	    ans += " ]";
	    return ans;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] a = new int[_size * 2];
    for (int i = 0; i < _data.length; i++) {
      a[i] = _data[i];
    }
    _data = a;
    _size = _data.length; 
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
    int store = _data[index];
    _data[index] = newVal; 
    return store; 
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
      }

      System.out.println("TESTING get()");
      System.out.println(curtis.get(5)); // should be 10
        /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
