/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW42 -- Add/Subtract Rational
2021-12-04
time spent:  0.5 hours

DISCO
- It is good to have both a static and non-static gcd so that we use it in both cases. 

QCC
- What does the error "int cannot be dereferenced" mean?
- Will we improvise add() and subtract() to return reduced sum and differences?
 *****************************************************/

public class Rational
{
  //   Instance variables for numerator and denominator
  private int _numerator;
  private int _denominator;


  // Default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
  }


  // Constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    this();
    if ( d != 0 ) {
      _numerator = n;
      _denominator = d;
    }
    else {
      System.out.println( "Invalid number. " +
                          "Denominator set to 1." );
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return _numerator + " / " + _denominator;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double)_numerator / _denominator;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object, leaves parameter alone
  // need not reduce
  public void multiply( Rational r )
  {
    _numerator   = this._numerator   * r._numerator;
    _denominator = this._denominator * r._denominator;
  }


  // divide
  // works the same as multiply, except the operation is division
  public void divide( Rational r )
  {
    if ( r._numerator != 0 ) {
      _numerator   = _numerator   * r._denominator;
      _denominator = _denominator * r._numerator;
    }
    else {
      System.out.println( "Div by 0 error. Values unchanged." );
    }
  }
  
  public void add(Rational r) 
  { 
    this._numerator = this._numerator * r._denominator + r._numerator * this._denominator; 
    this._denominator = this._denominator * r._denominator;   
  }
  
  public void subtract(Rational r) 
  {  
    this._numerator = this._numerator * r._denominator - r._numerator * this._denominator; 
    this._denominator = this._denominator * r._denominator;   
  }
  
  public static int gcd(int a, int b) {
     Rational c = new Rational(a,b);
     return c.gcd(); 
    
  }
  
  public int gcd() {
    int a = this._numerator;
    int b = this._denominator; 
     while (a > 0 && b > 0){
        if (a < b){
           b = b - a;
        }else if (a > b){
           a = a - b;
        }else{
           return a;
        }
     }
     if (a == 0){
        return b;
     } else {
        return a;
     }  
  }
  
  public void reduce() {
    int gcdr = gcd(_numerator, _denominator);
    _numerator = this._numerator / gcdr;
    _denominator = this._denominator / gcdr;
  }
  
  public int compareTo(Rational r) {
    Rational s = (Rational) r;
    this.reduce();
    s.reduce();
    
    if (this._numerator * s._denominator > s._numerator * this._denominator) {
      return 1;
    } else if (this._numerator * s._denominator < s._numerator * this._denominator) {
      return -1;
    } else {
      return 0; 
    }
    
  }


  //main method for testing
  public static void main( String[] args )
  {
      Rational r = new Rational( 3, 7 );
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );

      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 1, 6 );
      Rational w = new Rational( 8, 12 );
    
      System.out.println("\nTESTING compareTo:");
      System.out.println(w.compareTo(v)); // should be 1
      System.out.println(v.compareTo(w)); // should be -1
      System.out.println(u.compareTo(u)); // should be 0
      
      System.out.println("\nTESTING ADD:");
      r.add(t);
      System.out.println(r); // should be 71/35 
      System.out.println(r.gcd()); // Should be 1
      w.add(u);
      System.out.println(w); // should be 7/6
      System.out.println(w.gcd()); // Should be 1
      s.add(v);
      System.out.println(s); // should be 1/6
      System.out.println(s.gcd()); // should be 1
    
      System.out.println("\nTESTING SUBTRACT:");
      u.subtract(v);
      System.out.println(u); // should be 4/12
      w.subtract(s);
      System.out.println(w); // should be 36/36
    
      System.out.println("\nTESTING REDUCE:");
      u.reduce();
      System.out.println(u); // should be 1/3  
      w.reduce();
      System.out.println(w); // should be 1/1
  }
}//end class
 
