public class BigSib {
  String helloMsg;
  
  public BigSib() {
    helloMsg = "Word Up";
  }
  
  public String greet(String name) {
    return helloMsg + " " + name;
  }
  
  public void setHelloMsg(String newHelloMsg) {
    helloMsg = newHelloMsg;
  }
}
