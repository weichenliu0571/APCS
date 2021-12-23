/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW49 -- Java Conventions
2021-12-22
time spent:  0.5 hours
DISCO
- We can use "throw new ClassCastException()" to throw an error. 
- We should use boolean short circuiting to get out if the object is not of class Rational. 
QCC
- Do we have to implement Comparable?
 *****************************************************/

public class Driver {
  public static void main(String[] args) {
    Rational a = new Rational(3,5);
    Rational b = new Rational(6,11);
    Rational d = new Rational(4,5);
    Integer c = new Integer(5); 
    
    // This should run
    System.out.println(a.compareTo(b)); 
    System.out.println(a.compareTo(a));
    System.out.println(a.compareTo(d)); 
    
    // This should return error
    System.out.println(b.compareTo(c)); 
    
  }
  
  
  
  
}
