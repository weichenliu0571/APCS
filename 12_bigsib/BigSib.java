/*
Giant Pandas (Brian Li, Melody Lew, Weichen Liu, Robert, Blueface, Ollie)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05

DISCOVERIES
 0. If the method is static, the instance variable that is used everytime will be the last instance variable that is set. 
    
UNRESOLVED QUESTIONS
 0. 
*/

public class BigSib {
 
 public String helloMsg;
 
 public String setHelloMsg(String x) {
  helloMsg = x;
  return helloMsg;
 }
 
 public String greet(String x) {
  String answer = helloMsg + " " + x;
  return answer;
 }
 
}
