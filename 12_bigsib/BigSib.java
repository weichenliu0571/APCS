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

public class BigSib(String x) {
 
 public static String helloMsg;
 
 public static String setHelloMsg(String x) {
  helloMsg = x;
 }
 
 public static String greet(String x) {
  String answer = helloMsg + " " + x;
  return answer;
 }
}
