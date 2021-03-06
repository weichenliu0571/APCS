/*
Giant Rabbit (Brian Wang, Weichen Liu, Blueface)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCOVERIES
 0. If the methods in BigSib.java are static, the instance variable that is used everytime will be the last instance variable that is set. 
 1. The instance variable for each of these objects is different.
 2. We need to declare the instance variable before we can use it in the other methods
    
UNRESOLVED QUESTIONS
 0. What else can we do with these instance variables?
*/

public class BigSib {

 public String helloMsg; // declaring instance variable
 
 public String setHelloMsg(String x) {
  helloMsg = x;
  return helloMsg;
 }
 
 public String greet(String x) {
  String answer = helloMsg + " " + x;
  return answer;
 }
 
}
