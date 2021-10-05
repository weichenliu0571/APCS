/*
Giant Pandas (Brian Li, Melody Lew, Weichen Liu, Robert, Blueface, Ollie)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCOVERIES
 0. If the methods in BigSib.java are static, the instance variable that is used everytime will be the last instance variable that is set. 
 1. The instance variable for each of these objects is different.
    
UNRESOLVED QUESTIONS
 0. What else can we do with these instance variables?
*/

public class Greet {
  public static void main(String[] args) {
    String greeting;
    
    BigSib richard = new BigSib(); // creates an object called richard whose class is BigSib
    BigSib johnson = new BigSib();
    BigSib jacob = new BigSib();
    BigSib justin = new BigSib();
   
    richard.setHelloMsg( "Word up" ); // the instance variable "HelloMsg" in the object richard is set to "Word Up" 
    johnson.setHelloMsg( "Salutations" );
    jacob.setHelloMsg( "Hey ya");
    justin.setHelloMsg( "Sup");
    
    greeting = richard.greet( "freshman" ); // The String greeting is set to = to the String that is returned when the method greet in the object richard is invoked. 
    System.out.println( greeting ); // Just prints the string
   
    greeting = johnson.greet( "Dr. Spaceman");
    System.out.println( greeting );
   
    greeting = jacob.greet( "Fooey" );
    System.out.println( greeting );
   
    greeting = justin.greet( "mom");
    System.out.println( greeting );
   
  } // end main()
 
} // end Greet
