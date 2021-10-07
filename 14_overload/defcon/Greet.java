/*
Giant Pigs (Melody Lew, Brianna Tieu, Weichen Liu, Blueface, Pepe, Ollie)
APCS
HW14 -- Customize Your Creation
2021-10-07
DISCOVERIES
 0. As of now, we need the method setHelloMsg if we only have one default constructor.
 1. Typing the same code over and over again really helps with memorization. 
    
UNRESOLVED QUESTIONS
 0. Is there a way to only use the default constructor to get all the different outputs we need. 
*/
  
  
public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib();
    BigSib grizz = new BigSib();
    BigSib dotCom = new BigSib();
    BigSib tracy = new BigSib();
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    tracy.setHelloMsg("Salutations");
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
 
    grizz.setHelloMsg("Hey ya");
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    
    
    dotCom.setHelloMsg("Sup");
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
    
  } // end main()
  
} // end Greet
