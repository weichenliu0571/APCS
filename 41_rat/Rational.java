/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW41 -- Rational
2021-12-1
time spent: 0.5 hours

DISCO
-
QCC
-
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
 }
