/*
Giant Pandas (Brian Li, Melody Lew, Weichen Liu, Robert, Blueface, Ollie)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
DISCOVERIES
 0. 
    
UNRESOLVED QUESTIONS
 0. 
*/

public class Greet {
  public static void main(String[] args) {
    String greeting;
    
    BigSib richard = new BigSib(); // creates an object called richard whose class is BigSib
    richard.setHelloMsg( "Word up" ); // the instance variable "HelloMsg" in the object richard is set to "Word Up" 
    BigSib johnson = new BigSib();
    johnson.setHelloMsg( "Salutations" );
    BigSib jacob = new BigSib();
    jacob.setHelloMsg( "Hey ya");
    BigSib justin = new BigSib();
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
