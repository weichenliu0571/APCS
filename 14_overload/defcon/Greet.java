public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib();
    BigSib grizz = new BigSib();
    BigSib dotCom = new BigSib();
    BigSib tracy = new BigSib();
    
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    
    tracy.setHelloMsg("Salutations")
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
 
    grizz.setHelloMsg("Hey ya")
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    
    
    dotCom.setHelloMsg("Sup")
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
    
  } // end main()
  
} // end Greet
