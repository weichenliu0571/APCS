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

public class BigSib {
  //instance vars
  String helloMsg;
  
  public BigSib( String Msg ) {
    helloMsg = Msg; // tasks to be done at birth
  }
  
 
 public String greet(String name) {
  return helloMsg + " " + name;
 }
}
