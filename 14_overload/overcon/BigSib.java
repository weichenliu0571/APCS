public class BigSib {
  String helloMsg;
  
  public BigSib() {
    helloMsg = "Word Up";
  }
  
  public BigSib(String msg) {
    helloMsg = msg;
  }
  
  public void greet(String name) {
    return helloMsg + " " + name;
  }
}
