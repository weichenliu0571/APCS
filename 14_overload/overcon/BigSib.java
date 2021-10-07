/*
Giant Pigs (Melody Lew, Brianna Tieu, Weichen Liu, Blueface, Pepe, Ollie)
APCS
HW14 -- Customize Your Creation
2021-10-07
DISCOVERIES
 0. Overloaded constructors allow us to directly edit the instance variable in the object by just changing the argument on the line that creates the object. 
 1. Overloaded constructors are convenient; it cuts down on the amount of coding we need to do.
    
UNRESOLVED QUESTIONS
 0. Is there a way to only use the default constructor to get all the different outputs we need. 
*/

public class BigSib {
  String helloMsg;
  
  public BigSib() {
    helloMsg = "Word Up";
  }
  
  public BigSib(String msg) {
    helloMsg = msg;
  }
  
  public String greet(String name) {
    return helloMsg + " " + name;
  }
}
