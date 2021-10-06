/*
Giant Rabbit (Brian Wang, Weichen Liu, Blueface, Dolphin)
APCS
HW13 -- Where do BigSibs Come From?
2021-10-06
DISCOVERIES
 0. The constructor removes the need for the method setHelloMsg. 
 1. Instead of needing to use another line to invoke setHelloMsg, the constructor runs immediatly after you create a new object. It runs when new is called.
    
UNRESOLVED QUESTIONS
 0. What else can we do with constructors?
*/

public class Greet {
  public static void main(String[] args) {
    String greeting;
    
    BigSib richard = new BigSib( "Word up" ); // creates an object called richard whose class is BigSib
    BigSib johnson = new BigSib( "Salutations" );
    BigSib jacob = new BigSib( "Hey ya" );
    BigSib justin = new BigSib( "Sup" );
    
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
