/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW45 -- interface for SuperArray
2021-12-08
time spent:  0.5 hours

DISCO
- There should be no body for the methods in the interface. 
- The syntax for the class that implements the interface is [accessibility] [class] [className] implements [interfaceName] 
QCC
- Is there a situation where the methods in the interface should be private? 
 *****************************************************/

public interface ListInt {
  public int size();
  public int set(int index, int newVal); 
  public int get( int index ); 
  
  public void add( int newVal);
  public void add( int index, int newVal);
  public void remove( int index); 
}
