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
