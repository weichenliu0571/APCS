/*
Giant Rabbit (Brian Wang, Weichen Liu, Blueface, Dolphin)
APCS
HW12 -- Where do BigSibs Come From?
2021-10-06
DISCOVERIES
 0. 
    
UNRESOLVED QUESTIONS
 0. 
*/

public class BigSib {
  //instance vars
  String helloMsg;
  
  public BigSib( String Msg ) {
    helloMsg = Msg;
  }
  
 
 public String greet(String name) {
  return helloMsg + " " + name;
 }
}
