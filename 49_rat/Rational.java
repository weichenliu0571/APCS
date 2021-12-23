
/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW49 -- Java Conventions
2021-12-22
time spent:  0.5 hours

DISCO
-

QCC
-
 *****************************************************/

public class Rational implements Comparable
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
  public void multiply( Rational other )
  {
    _numerator   = this._numerator   * other._numerator;
    _denominator = this._denominator * other._denominator;
  }


  // divide
  // works the same as multiply, except the operation is division
  public void divide( Rational other )
  {
    if ( other._numerator != 0 ) {
      _numerator   = _numerator   * other._denominator;
      _denominator = _denominator * other._numerator;
    }
    else {
      System.out.println( "Div by 0 error. Values unchanged." );
    }
  }

  public void add(Rational other)
  {
    this._numerator = this._numerator * other._denominator + other._numerator * this._denominator;
    this._denominator = this._denominator * other._denominator;
  }

  public void subtract(Rational other)
  {
    this._numerator = this._numerator * other._denominator - other._numerator * this._denominator;
    this._denominator = this._denominator * other._denominator;
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
  
  public int compareTo(Object other){

    if(other instanceof Rational){
      Rational holder = (Rational)other;
      return _numerator * holder._denominator - holder._numerator * _denominator;
    }
    throw new ClassCastException("\ncompareTo() input not a Rational");

  }

  public boolean equals(Object other){

    if(other instanceof Rational){
      Rational holder = (Rational) other;
      return _numerator * holder._denominator == holder._numerator * _denominator;
    }
    return false;
  }


  }
}//end class
