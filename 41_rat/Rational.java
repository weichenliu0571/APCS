/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW41 -- Rational
2021-12-1
time spent: 0.5 hours

DISCO
- To divide a rational number a by a rational number b, you set the numerator of a to be the numerator of a * the denominator of b. Then you set the denominator of a to be the denominator of a * the numerator of b. 

QCC
- Is there a more efficient way to divide rational numbers?

 *****************************************************/

 public class Rational {
   private int numerator;
   private int denominator;

   public Rational() {
     numerator = 0;
     denominator = 1;
   }
   public Rational(int p, int q) {
     if (q == 0) {
       System.out.println("0 IS NOT A VALID DENOMINATOR FOR A RATIONAL NUMBER!!!");
       this();
     } else {
     numerator = p;
     denominator = q;
     }
   }

   public float floatValue() {
     return (float) numerator / (float) denominator;
   }
  
   public String toString() {
     return "" + numerator + "/" + denominator;
   }
  
   public void multiply(Rational a) {
     numerator = numerator * a.numerator;
     denominator = denominator * a.denominator; 
   }
  
   public void divide(Rational a) {
     numerator = numerator * a.denominator;
     denominator = denominator * a.numerator; 
   }
  
   public static void main(String[] args) {
    Rational r1 = new Rational();
    Rational r2 = new Rational(1,2);
    Rational r3 = new Rational(1,3);
    
    System.out.println(r1.toString());
    System.out.println(r2.toString());
    System.out.println(r3.toString());
    
    System.out.println(r1.floatValue());
    System.out.println(r2.floatValue());
    System.out.println(r3.floatValue());
    
    r2.multiply(r3);
    System.out.println(r2.toString());
    
    r2.divide(r3);
    System.out.println(r2.toString());
   }
 }
